package queue;

import java.util.Stack;

//Done push as costly operation

public class QueueUsingStacks {
	
	static Stack<Integer> s1 = new Stack<Integer>();  
    static Stack<Integer> s2 = new Stack<Integer>();  
    
    static void enqueue(int data) 
    {
    	while (!s1.isEmpty()) 
    	{
    		s2.add(s1.pop());
    	}
    	
    	s1.push(data);
    	
    	while(!s2.isEmpty()) 
    	{
    		s1.push(s2.pop());
    	}
    }
    
    static int deQueue() 
    {
    	if (s1.isEmpty())  
        {  
            System.out.println("Q is Empty");  
            System.exit(0);  
        }  
    	 int x = s1.peek();  
         s1.pop();  
         return x;  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingStacks q = new QueueUsingStacks();  
	    q.enqueue(1);  
	    q.enqueue(2);  
	    q.enqueue(3);  
	  
	    System.out.println(q.deQueue());  
	    System.out.println(q.deQueue()); 
	    System.out.println(q.deQueue()); 

	}
}
