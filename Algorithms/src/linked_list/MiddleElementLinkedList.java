package linked_list;

//done

public class MiddleElementLinkedList 
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
	
	public void append(int data)
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
	
	public void prepend(int data)
	{
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data)
	{
		if(head == null)
			return;
		if(head.data == data)
		{
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current != null)
		{
			if(current.next.data == data)
			{
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	void print()
	{
		Node current = head;
		while(current.next != null)
		{
			current = current.next;
			System.out.print(current.data+" ");
		}
		System.out.println();
	}
	
	void middleElement()
	{
		int count = 0;
		Node current = head;
		while (current.next!=null)
		{
			current = current.next;
			count++;
		}
		
		current = head;
		for (int i = 0; i <= count/2; i++) 
		{
			current = current.next;
		}
		System.out.println(current.data);		
	}
	
	public static void main(String[] args) 
	{
		MiddleElementLinkedList obj = new MiddleElementLinkedList();
		obj.append(2);
		obj.append(4);
		obj.append(6);
		obj.append(7);
		obj.append(5);
		obj.append(1);
		obj.print();
		obj.middleElement();
	}
}
