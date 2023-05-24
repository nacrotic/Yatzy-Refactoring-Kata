package net.leoperrin.nickel.yatze.evaluator;

import net.leoperrin.nickel.yatze.Roll;

public class StraightEvaluator implements Evaluator {
	private boolean largeStraight;

	private static final int LARGE_STRAIGHT_SCORE = 20;
	private static final int SMALL_STRAIGHT_SCORE = 15;

	public StraightEvaluator(boolean highStraight) {
		this.largeStraight = highStraight;
	}

	@Override
	public int getScore(Roll roll) {
		boolean uniq = roll.getDiceValue().stream().distinct().count() == 5;
		if (!uniq) {
			return 0;
		}
		if (largeStraight) {
			return roll.getDiceValue().stream().noneMatch(value -> value == 1) ? LARGE_STRAIGHT_SCORE : 0;
		} else {
			return roll.getDiceValue().stream().noneMatch(value -> value == 6) ? SMALL_STRAIGHT_SCORE : 0;
		}
	}
}
