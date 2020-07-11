package queue;

import java.util.Stack;

public class QueueUsingStacks2 {
	
	static Stack<Integer> s1 = new Stack<Integer>();  
    static Stack<Integer> s2 = new Stack<Integer>();  
	
	static void enqueue(int data) 
	{
		s1.add(data);
	}
	
	static void dequeue() 
	{
		if (s1.empty() && s2.empty()) 
		 { 
	            System.out.println( "Q is empty"); 
         }
		else 
		{
			while(!s1.isEmpty()) 
			{
				s2.add(s1.pop());
			}
			
			s2.pop();
			Stack<Integer> s = s2;
			s2 = s1;
			s1 = s;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingStacks2 obj = new QueueUsingStacks2();
		
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		
		

	}

}
