package fizzbuzz;

public class FizzBuzzer {

	private static final int[] MAGIC_KEYS = { 3, 5 }; // refactor : deux constantes
	private static final String[] MAGIC_VALUES = { "Fizz", "Buzz" };

	private int turn = 0;

	public String next() {
		turn += 1;
		// dictionnaire du pauvre
		for (int i = 0; i < MAGIC_KEYS.length; i++) {
			if (MAGIC_KEYS[i] == turn) {
				return MAGIC_VALUES[i];
			}
		}

		return Integer.toString(turn);
	}

}
