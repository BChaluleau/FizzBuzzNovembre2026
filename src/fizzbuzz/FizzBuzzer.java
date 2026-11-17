package fizzbuzz;

public class FizzBuzzer {

	private static final int[] MAGIC_KEYS = { 3, 5 };
	private static final String[] MAGIC_VALUES = { "Fizz", "Buzz" };

	private int turn = 0;

	public String next() {
		turn += 1;
		for (int i = 0; i < MAGIC_KEYS.length; i++) {
			if (turn % MAGIC_KEYS[i] == 0) { // turn est divisible par MAGIC_KEYS
				return MAGIC_VALUES[i];
			}
		}

		return Integer.toString(turn);
	}

}
