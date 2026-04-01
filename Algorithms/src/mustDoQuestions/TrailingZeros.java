package mustDoQuestions;

public class TrailingZeros {

	static int trailingZeroesInFact(int N) {

		long fact = 1;

		for (int i = N; i > 0; i--) {
			fact = fact * i;
		}
		return N;
		
	}

	public static void main(String[] args) {
		int N = 38;
		System.out.println(trailingZeroesInFact(N));
	}
}
