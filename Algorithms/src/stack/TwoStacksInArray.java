package stack;

//Done

public class TwoStacksInArray {
	
	int arr[];
	int top1;
	int top2;
	int size;
	
	TwoStacksInArray(int n)
	{
		arr = new int[n];
		top1 = -1;
		top2 = n;
		size = n;
	}
	
	void push1(int data) 
	{
		if(top1 < size/2-1) 
		{
			top1++;
			arr[top1] = data;
		}
		else if (top1 == size/2-1)
			System.out.println("Stack1 Overflow");
	}
	
	void push2(int data) 
	{
		if(top2 > size/2) 
		{
			top2--;
			arr[top2] = data;
		}
		else if(top2 == size/2)
			System.out.println("Stack2 Overflow");
	}
	
	void pop1() 
	{
		if(top1 != -1) 
		{
			arr[top1] = 0;
			top1--;
		}
		else
			System.out.println("Stack1 is empty");
	}
	
	void pop2() 
	{
		if(top2 != size) 
		{
			arr[top2] = 0;
			top2++;
		}
		else
			System.out.println("Stack2 is empty");	
	}
	
	void show() 
	{
		System.out.println("The stacks is: ");
		
		for (int i = 0; i < size; i++) 
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoStacksInArray obj = new TwoStacksInArray(6);
		obj.push1(1);
		obj.push1(2);
		obj.push1(3);
		obj.push1(4);
		obj.push1(5);
		obj.push1(6);

		obj.push2(1);
		obj.push2(2);
		obj.push2(3);
		obj.push2(4);

		obj.pop1();
		obj.pop2();
		
		obj.show();
	}

}
