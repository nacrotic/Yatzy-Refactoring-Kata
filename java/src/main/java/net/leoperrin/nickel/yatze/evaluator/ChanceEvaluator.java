package net.leoperrin.nickel.yatze.evaluator;

import net.leoperrin.nickel.yatze.Roll;

public class ChanceEvaluator implements Evaluator {
	@Override
	public int getScore(Roll roll) {
		return roll.getDiceValue().stream().reduce(0, Integer::sum);
	}
}
