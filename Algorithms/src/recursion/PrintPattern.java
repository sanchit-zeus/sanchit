package recursion;

//Done

public class PrintPattern {
	
	static void printPattern(int n, int m, boolean flag) {
		
		System.out.print(m + " ");
		
		if(flag == false && n==m)
			return;
		
		if(flag) 
		{
			if(m - 5 > 0)
				printPattern(n, m - 5, true);
			else
				printPattern(n, m - 5, false);
		}
		else
			printPattern(n, m + 5, false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 17;
		
		printPattern(n ,n ,true);
	}
}
