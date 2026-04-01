package basics;

public class CheckPrime {
	
	boolean prime(int x) {
		for (int i = 2; i <= 9; i++) {
			if(x%i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int x = 24;
		
		CheckPrime obj = new CheckPrime();
		System.out.println(obj.prime(x));
	}
}
