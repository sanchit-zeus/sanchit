package recursion;

public class PrintSum {
	
	int sumOfNos(int n) {
		if(n <= 1) 
			return n;
			
		return n + sumOfNos(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		PrintSum obj = new PrintSum();
		System.out.println(obj.sumOfNos(n));
	}
}
