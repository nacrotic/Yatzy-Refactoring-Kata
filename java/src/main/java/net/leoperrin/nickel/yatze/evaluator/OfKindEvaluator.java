package net.leoperrin.nickel.yatze.evaluator;

import net.leoperrin.nickel.yatze.Roll;
import net.leoperrin.nickel.yatze.exception.EvaluatorException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OfKindEvaluator implements Evaluator {
	private int expectedSize;

	private static final int YATZY_SCORE = 50;


	public OfKindEvaluator(int expectedSize) {
		if (expectedSize < 2 || expectedSize > 5) {
			throw new EvaluatorException("Impossible d'attendre moins de 2 éléménets d'un type ou plus de 5");
		}
		this.expectedSize = expectedSize;
	}

	@Override
	public int getScore(Roll roll) {
		Map<Integer, Integer> countOfKind = new HashMap<>();
		roll.getDiceValue().forEach(face -> {
			Integer nbFace = countOfKind.get(face);
			if (null == nbFace) {
				countOfKind.put(face, 1);
			} else {
				countOfKind.put(face, ++nbFace);
			}
		});

		Optional<Integer> bestFace = countOfKind.entrySet().stream()
			.filter(entry -> entry.getValue() >= expectedSize)
			.map(Map.Entry::getKey)
			.max(Integer::compareTo);

		if (bestFace.isEmpty()) {
			return 0;
		} else if (expectedSize == 5) {
			return YATZY_SCORE;
		} else {
			return expectedSize * bestFace.get();
		}
	}
}
