package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzerTest {

	private FizzBuzzer fb;

	@BeforeEach
	void setup() {
		// on repart d'une nouvelle instance propre
		fb = new FizzBuzzer();
	}

	@Test
	void firstPlayerSaysOne() {
		assertEquals("1", fb.next());
	}

	@Test
	void secondPlayerSaysTwo() {
		preshot(1);
		assertEquals("2", fb.next());
	}

	@Test
	void firstFizz() {
		preshot(2);
		assertEquals("Fizz", fb.next());
	}

	@Test
	void firstTurns() {
		preshot(3);
		assertEquals("4", fb.next());
	}

	@Test
	void firstBuzz() {
		preshot(4);
		assertEquals("Buzz", fb.next());
	}

	@Test
	void midGame() {
		preshot(5);
		String expected = "Fizz, 7, 8, Fizz, Buzz";
		assertEquals(expected, preshot(5));
	}

	@Test
	void firstFizzBuzz() {
		preshot(14);
		assertEquals("FizzBuzz", fb.next());
	}

	@Test
	void lateGame() {
		String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz";
		assertEquals(expected, preshot(25));
	}

	private String preshot(int nbTurns) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nbTurns; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(fb.next());
		}
		return sb.toString();
	}

}
