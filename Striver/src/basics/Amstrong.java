package basics;

public class Amstrong {
	
	boolean number(int x) {
		int temp = x;
		int ams = 0;
		int power = 0;
		
		while(temp != 0) {
			temp = temp/10;
			power ++;
		}
		
		temp = x;
		
		while(temp != 0) {
			ams += Math.pow(temp%10, power);
			temp = temp/10;
		}
		
		if(ams == x)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		int x = 234567898;
		
		Amstrong obj = new Amstrong();
		System.out.println(obj.number(x));
	}
}
