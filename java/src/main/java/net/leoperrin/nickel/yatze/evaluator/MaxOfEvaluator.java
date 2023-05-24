package net.leoperrin.nickel.yatze.evaluator;

import net.leoperrin.nickel.yatze.Roll;
import net.leoperrin.nickel.yatze.exception.EvaluatorException;

public class MaxOfEvaluator implements Evaluator {
	private int referenceValue;

	public MaxOfEvaluator(int referenceValue) {
		if (referenceValue < 0 || referenceValue > 6) {
			throw new EvaluatorException("La valeur de face attendue doit être comprise entre 1 et 6 inclu");
		}
		this.referenceValue = referenceValue;
	}

	@Override
	public int getScore(Roll roll) {
		return roll.getDiceValue().stream().filter(value -> value == referenceValue).reduce(0, Integer::sum);
	}
}
