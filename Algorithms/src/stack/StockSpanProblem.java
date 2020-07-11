package stack;

import java.util.Stack;

public class StockSpanProblem {
	
	void calculateSpan(int arr[]) 
	{
		Stack st = new Stack();
		
		for (int i = 0; i < arr.length; i++) 
			st.push(arr[i]);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {100, 80, 60, 70, 60, 75, 85};
		
		StockSpanProblem obj = new StockSpanProblem();
		obj.calculateSpan(arr);
		

	}
}
