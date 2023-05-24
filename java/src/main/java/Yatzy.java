import net.leoperrin.nickel.yatze.Roll;
import net.leoperrin.nickel.yatze.evaluator.ChanceEvaluator;
import net.leoperrin.nickel.yatze.evaluator.Evaluator;
import net.leoperrin.nickel.yatze.evaluator.FullEvaluator;
import net.leoperrin.nickel.yatze.evaluator.MaxOfEvaluator;
import net.leoperrin.nickel.yatze.evaluator.OfKindEvaluator;
import net.leoperrin.nickel.yatze.evaluator.StraightEvaluator;
import net.leoperrin.nickel.yatze.evaluator.TwoPairEvaluator;

public class Yatzy {

	public static int chance(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new ChanceEvaluator();
		return evaluator.getScore(roll);
	}

	public static int yatzy(int... dice) {
		Roll roll = new Roll(dice[0], dice[1], dice[2], dice[3], dice[4]);
		Evaluator evaluator = new OfKindEvaluator(5);
		return evaluator.getScore(roll);
	}

	public static int ones(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new MaxOfEvaluator(1);
		return evaluator.getScore(roll);
	}

	public static int twos(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new MaxOfEvaluator(2);
		return evaluator.getScore(roll);
	}

	public static int threes(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new MaxOfEvaluator(3);
		return evaluator.getScore(roll);
	}

	protected int[] dice;

	public Yatzy(int d1, int d2, int d3, int d4, int _5) {
		dice = new int[5];
		dice[0] = d1;
		dice[1] = d2;
		dice[2] = d3;
		dice[3] = d4;
		dice[4] = _5;
	}

	public int fours() {
		Roll roll = new Roll(dice[0], dice[1], dice[2], dice[3], dice[4]);
		Evaluator evaluator = new MaxOfEvaluator(4);
		return evaluator.getScore(roll);
	}

	public int fives() {
		Roll roll = new Roll(dice[0], dice[1], dice[2], dice[3], dice[4]);
		Evaluator evaluator = new MaxOfEvaluator(5);
		return evaluator.getScore(roll);
	}

	public int sixes() {
		Roll roll = new Roll(dice[0], dice[1], dice[2], dice[3], dice[4]);
		Evaluator evaluator = new MaxOfEvaluator(6);
		return evaluator.getScore(roll);
	}

	public static int score_pair(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new OfKindEvaluator(2);
		return evaluator.getScore(roll);
	}

	public static int two_pair(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new TwoPairEvaluator();
		return evaluator.getScore(roll);
	}

	public static int four_of_a_kind(int _1, int _2, int d3, int d4, int d5) {
		Roll roll = new Roll(_1, _2, d3, d4, d5);
		Evaluator evaluator = new OfKindEvaluator(4);
		return evaluator.getScore(roll);
	}

	public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new OfKindEvaluator(3);
		return evaluator.getScore(roll);
	}

	public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new StraightEvaluator(false);
		return evaluator.getScore(roll);
	}

	public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new StraightEvaluator(true);
		return evaluator.getScore(roll);
	}

	public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
		Roll roll = new Roll(d1, d2, d3, d4, d5);
		Evaluator evaluator = new FullEvaluator();
		return evaluator.getScore(roll);
	}
}



