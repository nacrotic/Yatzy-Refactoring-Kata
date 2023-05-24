package net.leoperrin.nickel.yatze.evaluator;

import net.leoperrin.nickel.yatze.Roll;

import java.util.HashMap;
import java.util.Map;

public class TwoPairEvaluator implements Evaluator {
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

		if (countOfKind.size() <= 1 || countOfKind.size() >= 4) {
			return 0;
		}


		int sumOfEligibleFace = countOfKind.entrySet()
			.stream()
			.filter(entry -> entry.getValue() >= 2 && entry.getValue() < 4)
			.map(Map.Entry::getKey)
			.reduce(0, Integer::sum);

		return sumOfEligibleFace * 2;
	}
}
