package algorithms;

//Done

import java.util.ArrayList;

public class BonAppétit 
{
	static void bonAppetit(ArrayList<Integer> bill, int k, int b) 
	{
		int charge = 0;
		int share = 0;
		for (int i = 0; i < bill.size(); i++)
		{
			if(i != k)
				charge += bill.get(i);
		}
		share = charge/2;
		
		if(share == b)
			System.out.println("BonAppétit");
		else
			System.out.println(b - share);
    }

	public static void main(String[] args) 
	{
//		int n = 4;
		int k  = 1;
		int b = 12;
		
		ArrayList<Integer> bill = new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);
		
		bonAppetit(bill,k,b);

	}
}
