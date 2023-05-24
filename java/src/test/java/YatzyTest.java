import net.leoperrin.nickel.yatze.Roll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YatzyTest {

	@Test
	public void test_chance() {
		assertEquals(15, Yatzy.chance(new Roll(2, 3, 4, 5, 1)));
		assertEquals(16, Yatzy.chance(new Roll(3, 3, 4, 5, 1)));
		assertEquals(5, Yatzy.chance(new Roll(1, 1, 1, 1, 1)));
	}

	@Test
	public void test_yatzy() {
		assertEquals(50, Yatzy.yatzy(new Roll(4, 4, 4, 4, 4)));
		assertEquals(50, Yatzy.yatzy(new Roll(6, 6, 6, 6, 6)));
		assertEquals(0, Yatzy.yatzy(new Roll(6, 6, 6, 6, 3)));
		assertEquals(0, Yatzy.yatzy(new Roll(1, 2, 3, 4, 5)));
	}

	@Test
	public void test_1s() {
		assertEquals(1, Yatzy.ones(new Roll(1, 2, 3, 4, 5)));
		assertEquals(2, Yatzy.ones(new Roll(1, 2, 1, 4, 5)));
		assertEquals(0, Yatzy.ones(new Roll(6, 2, 2, 4, 5)));
		assertEquals(4, Yatzy.ones(new Roll(1, 2, 1, 1, 1)));
		assertEquals(5, Yatzy.ones(new Roll(1, 1, 1, 1, 1)));
	}

	@Test
	public void test_2s() {
		assertEquals(4, Yatzy.twos(new Roll(1, 2, 3, 2, 6)));
		assertEquals(10, Yatzy.twos(new Roll(2, 2, 2, 2, 2)));
		assertEquals(0, Yatzy.twos(new Roll(1, 3, 4, 5, 6)));
	}

	@Test
	public void test_3s() {
		assertEquals(6, Yatzy.threes(new Roll(1, 2, 3, 2, 3)));
		assertEquals(12, Yatzy.threes(new Roll(2, 3, 3, 3, 3)));
		assertEquals(15, Yatzy.threes(new Roll(3, 3, 3, 3, 3)));
		assertEquals(0, Yatzy.threes(new Roll(1, 2, 4, 4, 6)));
	}

	@Test
	public void test_4s() {
		assertEquals(12, Yatzy.fours(new Roll(4, 4, 4, 5, 5)));
		assertEquals(8, Yatzy.fours(new Roll(4, 4, 5, 5, 5)));
		assertEquals(4, Yatzy.fours(new Roll(4, 5, 5, 5, 5)));
		assertEquals(20, Yatzy.fours(new Roll(4, 4, 4, 4, 4)));
		assertEquals(0, Yatzy.fours(new Roll(1, 2, 3, 5, 6)));
	}

	@Test
	public void test_5s() {
		assertEquals(10, Yatzy.fives(new Roll(4, 4, 4, 5, 5)));
		assertEquals(15, Yatzy.fives(new Roll(4, 4, 5, 5, 5)));
		assertEquals(20, Yatzy.fives(new Roll(4, 5, 5, 5, 5)));
		assertEquals(0, Yatzy.fives(new Roll(1, 2, 3, 4, 6)));
		assertEquals(25, Yatzy.fives(new Roll(5, 5, 5, 5, 5)));
	}

	@Test
	public void test_6s() {
		assertEquals(0, Yatzy.sixes(new Roll(4, 4, 4, 5, 5)));
		assertEquals(6, Yatzy.sixes(new Roll(4, 4, 6, 5, 5)));
		assertEquals(18, Yatzy.sixes(new Roll(6, 5, 6, 6, 5)));
		assertEquals(30, Yatzy.sixes(new Roll(6, 6, 6, 6, 6)));
	}

	@Test
	public void test_pair() {
		assertEquals(6, Yatzy.score_pair(new Roll(3, 4, 3, 5, 6)));
		assertEquals(10, Yatzy.score_pair(new Roll(5, 3, 3, 3, 5)));
		assertEquals(12, Yatzy.score_pair(new Roll(5, 3, 6, 6, 5)));
		assertEquals(0, Yatzy.score_pair(new Roll(1, 3, 2, 6, 5)));
		assertEquals(2, Yatzy.score_pair(new Roll(1, 1, 1, 1, 1)));
	}

	@Test
	public void test_twoPair() {
		assertEquals(16, Yatzy.two_pair(new Roll(3, 3, 5, 4, 5)));
		assertEquals(16, Yatzy.two_pair(new Roll(3, 3, 5, 5, 5)));
		assertEquals(0, Yatzy.two_pair(new Roll(1, 3, 5, 2, 4)));
		assertEquals(18, Yatzy.two_pair(new Roll(5, 3, 5, 4, 4)));
		assertEquals(0, Yatzy.two_pair(new Roll(1, 1, 1, 1, 4)));
	}

	@Test
	public void test_threeOfAKind() {
		assertEquals(9, Yatzy.three_of_a_kind(new Roll(3, 3, 3, 4, 5)));
		assertEquals(15, Yatzy.three_of_a_kind(new Roll(5, 3, 5, 4, 5)));
		assertEquals(9, Yatzy.three_of_a_kind(new Roll(3, 3, 3, 3, 5)));
		assertEquals(0, Yatzy.three_of_a_kind(new Roll(1, 2, 3, 4, 5)));
		assertEquals(18, Yatzy.three_of_a_kind(new Roll(6, 6, 6, 6, 6)));
	}

	@Test
	public void test_fourOfAKind() {
		assertEquals(12, Yatzy.four_of_a_kind(new Roll(3, 3, 3, 3, 5)));
		assertEquals(20, Yatzy.four_of_a_kind(new Roll(5, 5, 5, 4, 5)));
		assertEquals(24, Yatzy.four_of_a_kind(new Roll(6, 6, 6, 6, 6)));
		assertEquals(0, Yatzy.four_of_a_kind(new Roll(6, 1, 2, 6, 6)));
	}

	@Test
	public void test_smallStraight() {
		assertEquals(15, Yatzy.smallStraight(new Roll(1, 2, 3, 4, 5)));
		assertEquals(15, Yatzy.smallStraight(new Roll(2, 3, 4, 5, 1)));
		assertEquals(0, Yatzy.smallStraight(new Roll(1, 2, 2, 4, 5)));
		assertEquals(0, Yatzy.smallStraight(new Roll(2, 3, 4, 5, 6)));
	}

	@Test
	public void test_largeStraight() {
		assertEquals(20, Yatzy.largeStraight(new Roll(6, 2, 3, 4, 5)));
		assertEquals(20, Yatzy.largeStraight(new Roll(2, 3, 4, 5, 6)));
		assertEquals(0, Yatzy.largeStraight(new Roll(1, 2, 2, 4, 5)));
	}

	@Test
	public void test_fullHouse() {
		assertEquals(18, Yatzy.fullHouse(new Roll(6, 2, 2, 2, 6)));
		assertEquals(0, Yatzy.fullHouse(new Roll(2, 3, 4, 5, 6)));
		assertEquals(0, Yatzy.fullHouse(new Roll(2, 2, 2, 2, 2)));
	}
}
