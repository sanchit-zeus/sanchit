package basics;

import java.util.Iterator;

public class GCD {
	int number(int a, int b) {
		int max, min;
		max = Math.max(a, b);
		min = Math.min(a, b);
		int hcf = 0;
		
		for (int i = 1; i <= min; i++) {
			if(max%i == 0 && min%i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}

	public static void main(String[] args) {
		int a = 4, b = 8;
		
		GCD obj = new GCD();
		System.out.println(obj.number(a, b));
	}

}
