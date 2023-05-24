import net.leoperrin.nickel.yatze.Roll;
import net.leoperrin.nickel.yatze.evaluator.ChanceEvaluator;
import net.leoperrin.nickel.yatze.evaluator.Evaluator;
import net.leoperrin.nickel.yatze.evaluator.FullEvaluator;
import net.leoperrin.nickel.yatze.evaluator.MaxOfEvaluator;
import net.leoperrin.nickel.yatze.evaluator.OfKindEvaluator;
import net.leoperrin.nickel.yatze.evaluator.StraightEvaluator;
import net.leoperrin.nickel.yatze.evaluator.TwoPairEvaluator;

public class Yatzy {

	private Yatzy() {
	}
	
	public static int chance(Roll roll) {
		Evaluator evaluator = new ChanceEvaluator();
		return evaluator.getScore(roll);
	}

	public static int yatzy(Roll roll) {
		Evaluator evaluator = new OfKindEvaluator(5);
		return evaluator.getScore(roll);
	}

	public static int ones(Roll roll) {
		Evaluator evaluator = new MaxOfEvaluator(1);
		return evaluator.getScore(roll);
	}

	public static int twos(Roll roll) {
		Evaluator evaluator = new MaxOfEvaluator(2);
		return evaluator.getScore(roll);
	}

	public static int threes(Roll roll) {
		Evaluator evaluator = new MaxOfEvaluator(3);
		return evaluator.getScore(roll);
	}

	public static int fours(Roll roll) {
		Evaluator evaluator = new MaxOfEvaluator(4);
		return evaluator.getScore(roll);
	}

	public static int fives(Roll roll) {
		Evaluator evaluator = new MaxOfEvaluator(5);
		return evaluator.getScore(roll);
	}

	public static int sixes(Roll roll) {
		Evaluator evaluator = new MaxOfEvaluator(6);
		return evaluator.getScore(roll);
	}

	public static int score_pair(Roll roll) {
		Evaluator evaluator = new OfKindEvaluator(2);
		return evaluator.getScore(roll);
	}

	public static int two_pair(Roll roll) {
		Evaluator evaluator = new TwoPairEvaluator();
		return evaluator.getScore(roll);
	}

	public static int four_of_a_kind(Roll roll) {
		Evaluator evaluator = new OfKindEvaluator(4);
		return evaluator.getScore(roll);
	}

	public static int three_of_a_kind(Roll roll) {
		Evaluator evaluator = new OfKindEvaluator(3);
		return evaluator.getScore(roll);
	}

	public static int smallStraight(Roll roll) {
		Evaluator evaluator = new StraightEvaluator(false);
		return evaluator.getScore(roll);
	}

	public static int largeStraight(Roll roll) {
		Evaluator evaluator = new StraightEvaluator(true);
		return evaluator.getScore(roll);
	}

	public static int fullHouse(Roll roll) {
		Evaluator evaluator = new FullEvaluator();
		return evaluator.getScore(roll);
	}
}



