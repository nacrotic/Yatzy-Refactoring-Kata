package net.leoperrin.nickel.yatze.evaluator;

import net.leoperrin.nickel.yatze.Roll;

import java.util.HashMap;
import java.util.Map;

public class FullEvaluator implements Evaluator {
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

		if (countOfKind.size() != 2) {
			return 0;
		}
		if (countOfKind.entrySet().stream().anyMatch(entry -> entry.getValue() != 2 && entry.getValue() != 3)) {
			return 0;
		}

		return countOfKind.entrySet().stream().map(entry -> entry.getValue() * entry.getKey()).reduce(0, Integer::sum);
	}
}
