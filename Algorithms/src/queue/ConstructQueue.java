package queue;

//Done

public class ConstructQueue {
	
	static int n = 5;
	static int front = 0;
	static int rear = 0;

	static void enqueue(int arr[], int ele) 
	{
		if(rear != n) 
		{
			arr[rear] = ele;
			rear++;
		}
		else if(rear >= n)
			System.out.println("Queue is full");
	}
	
	static void dequeue(int arr[]) 
	{
		if(front!=rear) 
		{
			arr[front] = 0;
			front++;
		}
		else
			System.out.println("Queue empty");
	}
	
	static void peek(int arr[]) 
	{
		for (int i = front; i < rear; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	static void search(int arr[], int ele) 
	{
		int flag = 0;
		for (int i = front; i < rear; i++) 
		{
			if(arr[i] == ele)
				flag++;
		}
		if(flag != 0)
			System.out.println("Found");
		else
			System.out.println("Not found");
		
	}
	
	public static void main(String[] args) 
	{
		int arr[] = new int[n];
		
		enqueue(arr,1);
		enqueue(arr,2);
		enqueue(arr,3);
		enqueue(arr,4);
		enqueue(arr,5);
		enqueue(arr,5);
		dequeue(arr);
		peek(arr);
		search(arr,3);
	}
}
