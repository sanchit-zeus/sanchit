package recursion;

public class PrintNumbers {
	
	public void printNos(int N)
    {
		if(N>0) {
			printNos(N-1);
			System.out.println("Sanchit");
		}		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5000;
		
		PrintNumbers obj = new PrintNumbers();
		obj.printNos(n);
	}
}
