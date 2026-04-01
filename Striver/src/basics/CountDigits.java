package basics;

public class CountDigits {
	
	int evenlyDivides(int N){
		int temp = N;
		int count = 0;
		
		while(temp > 0)
		{
			if(temp%10 != 0 && N%(temp%10) == 0)
				count ++;
			temp = temp/10;
		}
		return count;
    }

	public static void main(String[] args) {
		int N = 22074;
		
		CountDigits obj = new CountDigits();
		System.out.println(obj.evenlyDivides(N));
	}
}
