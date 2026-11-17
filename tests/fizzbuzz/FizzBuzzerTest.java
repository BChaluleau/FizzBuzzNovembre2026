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

	private void preshot(int nbTurns) {
		for (int i = 0; i < nbTurns; i++) {
			fb.next();
		}
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
		assertEquals("Fizz", fb.next());
		assertEquals("7", fb.next());
		assertEquals("8", fb.next());
		assertEquals("Fizz", fb.next());
		assertEquals("Buzz", fb.next());
	}

}
