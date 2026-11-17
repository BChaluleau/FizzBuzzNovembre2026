package fizzbuzz;

public class FizzBuzzer {

	private static final int MAGIC_VALUE = 3; // refactor : deux constantes
	private static final String MAGIC_KEY = "Fizz";

	private int turn = 0;

	public String next() {
		turn += 1;
		if (turn == MAGIC_VALUE) {
			return MAGIC_KEY;
		}
		return Integer.toString(turn);
	}

}
