import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YatzyTest {

	@Test
	public void test_chance() {
		assertEquals(15, Yatzy.chance(2, 3, 4, 5, 1));
		assertEquals(16, Yatzy.chance(3, 3, 4, 5, 1));
		assertEquals(5, Yatzy.chance(1, 1, 1, 1, 1));
	}

	@Test
	public void test_yatzy() {
		assertEquals(50, Yatzy.yatzy(4, 4, 4, 4, 4));
		assertEquals(50, Yatzy.yatzy(6, 6, 6, 6, 6));
		assertEquals(0, Yatzy.yatzy(6, 6, 6, 6, 3));
		assertEquals(0, Yatzy.yatzy(1, 2, 3, 4, 5));
	}

	@Test
	public void test_1s() {
		assertEquals(1, Yatzy.ones(1, 2, 3, 4, 5));
		assertEquals(2, Yatzy.ones(1, 2, 1, 4, 5));
		assertEquals(0, Yatzy.ones(6, 2, 2, 4, 5));
		assertEquals(4, Yatzy.ones(1, 2, 1, 1, 1));
		assertEquals(5, Yatzy.ones(1, 1, 1, 1, 1));
	}

	@Test
	public void test_2s() {
		assertEquals(4, Yatzy.twos(1, 2, 3, 2, 6));
		assertEquals(10, Yatzy.twos(2, 2, 2, 2, 2));
		assertEquals(0, Yatzy.twos(1, 3, 4, 5, 6));
	}

	@Test
	public void test_3s() {
		assertEquals(6, Yatzy.threes(1, 2, 3, 2, 3));
		assertEquals(12, Yatzy.threes(2, 3, 3, 3, 3));
		assertEquals(15, Yatzy.threes(3, 3, 3, 3, 3));
		assertEquals(0, Yatzy.threes(1, 2, 4, 4, 6));
	}

	@Test
	public void test_4s() {
		assertEquals(12, new Yatzy(4, 4, 4, 5, 5).fours());
		assertEquals(8, new Yatzy(4, 4, 5, 5, 5).fours());
		assertEquals(4, new Yatzy(4, 5, 5, 5, 5).fours());
		assertEquals(20, new Yatzy(4, 4, 4, 4, 4).fours());
		assertEquals(0, new Yatzy(1, 2, 3, 5, 6).fours());
	}

	@Test
	public void test_5s() {
		assertEquals(10, new Yatzy(4, 4, 4, 5, 5).fives());
		assertEquals(15, new Yatzy(4, 4, 5, 5, 5).fives());
		assertEquals(20, new Yatzy(4, 5, 5, 5, 5).fives());
		assertEquals(0, new Yatzy(1, 2, 3, 4, 6).fives());
		assertEquals(25, new Yatzy(5, 5, 5, 5, 5).fives());
	}

	@Test
	public void test_6s() {
		assertEquals(0, new Yatzy(4, 4, 4, 5, 5).sixes());
		assertEquals(6, new Yatzy(4, 4, 6, 5, 5).sixes());
		assertEquals(18, new Yatzy(6, 5, 6, 6, 5).sixes());
		assertEquals(30, new Yatzy(6, 6, 6, 6, 6).sixes());
	}

	@Test
	public void test_pair() {
		assertEquals(6, Yatzy.score_pair(3, 4, 3, 5, 6));
		assertEquals(10, Yatzy.score_pair(5, 3, 3, 3, 5));
		assertEquals(12, Yatzy.score_pair(5, 3, 6, 6, 5));
		assertEquals(0, Yatzy.score_pair(1, 3, 2, 6, 5));
		assertEquals(2, Yatzy.score_pair(1, 1, 1, 1, 1));
	}

	@Test
	public void test_twoPair() {
		assertEquals(16, Yatzy.two_pair(3, 3, 5, 4, 5));
		assertEquals(16, Yatzy.two_pair(3, 3, 5, 5, 5));
		assertEquals(0, Yatzy.two_pair(1, 3, 5, 2, 4));
		assertEquals(18, Yatzy.two_pair(5, 3, 5, 4, 4));
		assertEquals(0, Yatzy.two_pair(1, 1, 1, 1, 4));
	}

	@Test
	public void test_threeOfAKind() {
		assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 4, 5));
		assertEquals(15, Yatzy.three_of_a_kind(5, 3, 5, 4, 5));
		assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 3, 5));
		assertEquals(0, Yatzy.three_of_a_kind(1, 2, 3, 4, 5));
		assertEquals(18, Yatzy.three_of_a_kind(6, 6, 6, 6, 6));
	}

	@Test
	public void test_fourOfAKind() {
		assertEquals(12, Yatzy.four_of_a_kind(3, 3, 3, 3, 5));
		assertEquals(20, Yatzy.four_of_a_kind(5, 5, 5, 4, 5));
		assertEquals(24, Yatzy.four_of_a_kind(6, 6, 6, 6, 6));
		assertEquals(0, Yatzy.four_of_a_kind(6, 1, 2, 6, 6));
	}

	@Test
	public void test_smallStraight() {
		assertEquals(15, Yatzy.smallStraight(1, 2, 3, 4, 5));
		assertEquals(15, Yatzy.smallStraight(2, 3, 4, 5, 1));
		assertEquals(0, Yatzy.smallStraight(1, 2, 2, 4, 5));
		assertEquals(0, Yatzy.smallStraight(2, 3, 4, 5, 6));
	}

	@Test
	public void test_largeStraight() {
		assertEquals(20, Yatzy.largeStraight(6, 2, 3, 4, 5));
		assertEquals(20, Yatzy.largeStraight(2, 3, 4, 5, 6));
		assertEquals(0, Yatzy.largeStraight(1, 2, 2, 4, 5));
	}

	@Test
	public void test_fullHouse() {
		assertEquals(18, Yatzy.fullHouse(6, 2, 2, 2, 6));
		assertEquals(0, Yatzy.fullHouse(2, 3, 4, 5, 6));
		assertEquals(0, Yatzy.fullHouse(2, 2, 2, 2, 2));
	}
}
