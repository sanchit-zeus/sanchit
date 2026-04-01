package basics;

public class PrintAllDivisors {
	void numbers(int x) {
		for (int i = 1; i <= x; i++) {
			if(x%i == 0)
				System.out.print(i+" ");
		}
	}
	
    void printDivisorsOptimal(int n){
		
		System.out.println("The divisors of "+n+" are:");
		
		for(int i = 1; i <= (int)Math.sqrt(n); i++) {
			if(n % i == 0){
				System.out.print(i + " ");
				if(i != n/i) {
					System.out.print(n/i + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int x = 18;
		
		PrintAllDivisors obj = new PrintAllDivisors();
//		obj.numbers(x);
		obj.printDivisorsOptimal(x);
	}
}
