package queue;

//Done

class QNode
{
	int key;
	QNode next;
	
	QNode(int key)
	{
		 this.key = key;
		 this.next = null;
	}
}

class Queue
{
	QNode front, rear;
	
	public Queue()
	{
		this.front = this.rear = null;
	}
	
	void enqueue(int key)
	{
		QNode temp = new QNode(key);
		
		if(this.rear == null)
		{
			this.front = this.rear = temp;
			return;
		}
		else
		{
			this.rear.next = temp;
			this.rear = temp;
		}
	}
	
	void dequeue()
	{
		if(this.front == null)
			return;
		
		QNode temp = this.front;
		this.front = this.front.next;
		
		if(this.front == null)
		{
			this.rear = null;
		}
		return;
	}
}


public class QueueUsingLinkedList 
{
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
	}
}
