package stack;

//Done push method costly

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	
	static Queue q1 = new LinkedList();
	static Queue q2 = new LinkedList();
	
	static int cur_size;
	
	StackUsingTwoQueues()
	{
		cur_size = 0;
	}
	
	static void push(int x) 
	{
		cur_size++;
		
		q2.add(x);
		
//		while(!q1.isEmpty()) 
//		{
//			q2.add(q1.peek());
//			q1.remove();
//		}
		
		Queue <Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	static void pop() 
	{
//		if(q1.isEmpty())
//			System.out.println("Queue is empty.");
//		else 
//		{
//			q1.remove();
//			cur_size--;
//		}
	}
	
	public static void main(String[] args) {
				
		push(0);
		push(1);
		push(2);
		push(3);
	}
}

