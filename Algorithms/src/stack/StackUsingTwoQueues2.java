package stack;

//Done pop as costly operation

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues2 {
	
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	
	static int cur_size;
	
	StackUsingTwoQueues2 ()
	{
		cur_size = 0;
	}
	
	static void push(int x) 
	{
		q1.add(x);
		cur_size++;
	}
	
	static void pop() 
	{
//		if(q1.isEmpty())
//			System.out.println("Queue is empty");
//		else 
//		{
//			while(cur_size != 1) 
//			{
//				q2.add(q1.peek());
//				q1.remove();
//			}
//			
//			q1.remove();
//			cur_size--;
//			Queue<Integer> q = q1;
//			q1 = q2;
//			q2 = q;	
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(0);
		push(1);
	    push(2);
		push(3);
	}

}
