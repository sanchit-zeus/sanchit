package stack;

//Done

public class StackConstruct {
	
	static int n = 10;
	static int top = -1;
	
	static void stack_push(int arr[], int ele) 
	{
		if(top < n-1) 
		{
			top++;
			arr[top] = ele;	
		}
		else
			System.out.println("Stack Full");
	}
	
	static void stack_pop(int arr[]) 
	{
		if(top != -1) 
		{
			arr[top] = 0;
			top--;
		}
		else
			System.out.println("Stack Empty");
	}
	
	static void stack_peek(int arr[])
	{
		if(top != -1) 
		{
			for (int i = top; i >= 0; i--) 
			{
				System.out.println(arr[i]);
			}
		}
		else
			System.out.println("Stack Empty");
	}
	
	static void stack_search(int arr[], int ele) 
	{
		int flag = 0;
		for (int i = 0; i <= top; i++) 
		{
			if(arr[i]==ele)
				flag++;
		}
		if(flag!=0)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}

	public static void main(String[] args) 
	{		
		int arr[] = new int[n];
		stack_push(arr,1);
		stack_push(arr,2);
		stack_push(arr,3);
		stack_push(arr,4);
		stack_push(arr,5);
		stack_push(arr,6);
		stack_peek(arr);
		stack_search(arr,4);
		stack_search(arr,9);
		stack_pop(arr);
		stack_pop(arr);
		stack_peek(arr);
//		stack_pop(arr);
//		stack_pop(arr);
//		stack_pop(arr);
//		stack_pop(arr);
	}
}
