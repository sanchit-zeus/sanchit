package linked_list;

//Done

public class ReverseLinkedList 
{
	 class Node
	 {
		 int data;
		 Node next;
		 
		 Node(int data)
		 {
			 this.data = data;
			 next = null;
		 }
	 }
	 
	Node head;
	
	void append(int data)
	{
		if(head == null)
		{
			head = new Node(data);
		}
		else
		{
			Node current = head;
			
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = new Node(data);
		}
	}
	
	void prepend(int data)
	{
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	void delete(int data)
	{
		if(head == null)
			return;
		
		if(head.data == data)
		{
			head = head.next;
			return;
		}
		
		Node current = head;
		
		while(current.next != null)
		{
			if(current.next.data == data)
			{
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void print() 
	{
		Node current = head;
		while(current.next != null) 
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print(current.data);
		System.out.println();
	}
	
	void reverse()
	{
		Node current, previous = null, next = null;
		current = head;
		
		while(current != null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}	
		head = previous;
	}
	
	public static void main(String[] args) 
	{
		ReverseLinkedList obj = new ReverseLinkedList();
		obj.append(1);
		obj.append(2);
		obj.append(3);
		obj.append(4);
		obj.append(5);
		obj.print();
		obj.reverse();
		obj.print();
	}
}
