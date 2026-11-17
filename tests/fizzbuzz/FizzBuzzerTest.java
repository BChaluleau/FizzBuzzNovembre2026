package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzerTest {

	private FizzBuzzer fb;

	@BeforeEach
	void setup() {
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
		assertEquals("4", fb.next()); // red --> green gratuit ! --> refactor gratuit
	}

}
