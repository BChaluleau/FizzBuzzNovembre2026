package fizzbuzz;

public class FizzBuzzer {

	private int turn = 0;

	public String next() {
		turn += 1;
		return Integer.toString(turn);
	}

}
