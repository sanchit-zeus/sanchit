package linked_list;

public class NthNode 
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
	
	Node head;
	
	void append(int data)
	{
		if(head == null)
		{
			head = new Node(data);
		}
		
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	void print()
	{
		Node current = head;
		while(current.next != null)
		{
			current = current.next;
			System.out.print(current.data+" ");
		}
	}
	
	void distance(int size, int n)
	{
		Node current = head;
		int count = -1;
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		if(current.data != n) 
		{
			current = head;
			
			while(current.next != null)
			{
				if(current.data == n)
				{
					System.out.println(size - count);
					break;
				}
				else
				{
					count ++;
					current = current.next;
				}
			}
		}
		else
			System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		int size = 4, n = 100;
		NthNode obj = new NthNode();
		obj.append(10);
		obj.append(5);
		obj.append(100);
		obj.append(5);
//		obj.append(5);
//		obj.append(6);
//		obj.append(7);
//		obj.append(8);
//		obj.append(9);
		obj.distance(size,n);
	}
}
