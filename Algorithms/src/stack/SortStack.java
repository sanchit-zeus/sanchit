package stack;

//done

import java.util.Scanner;

public class SortStack {
	
	static Scanner src = new Scanner(System.in);
	
	static int n ;
	static int top = -1;
	
	SortStack(int n)
	{
		this.n = n;
	}
	
	void stack_push(int arr[], int ele) 
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
	
	void stack_print(int arr[])
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
	
	void stack_search(int arr[], int ele) 
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
	
	void input(int arr[]) 
	{
		int i = 0;

		System.out.println("Enter the elements: ");
		while(i < n) 
		{
			int ele = src.nextInt();
			stack_push(arr,ele);
			i++;
		}
	}
	
	void sort(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[i] < arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) 
	{		
		SortStack obj = new SortStack(6);
		int arr[] = new int[n];
		
		obj.input(arr);		
		obj.sort(arr);
		obj.stack_print(arr);
	}
}
