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
		// red ==> ça ne compile pas
		// green ==> faire passer le test le plus simplement possible
	}

}
