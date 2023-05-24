package net.leoperrin.nickel.yatze;

import net.leoperrin.nickel.yatze.exception.InvalidRollException;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Roll {
	private Collection<Integer> diceValue;

	public Roll(int firstD6, int secondD6, int thirdD6, int fourthD6, int fifthD6) {
		this.diceValue = Arrays.asList(firstD6, secondD6, thirdD6, fourthD6, fifthD6);
		List<Integer> invalidValues = this.diceValue.stream().filter(value -> value < 1 || value > 6).collect(Collectors.toList());

		if (!invalidValues.isEmpty()) {
			throw new InvalidRollException("Les faces " + Arrays.toString(invalidValues.toArray()) + " ne sont pas des valeurs valides pour un dé à 6 faces standard");
		}
	}

	public Collection<Integer> getDiceValue() {
		return diceValue;
	}
}
