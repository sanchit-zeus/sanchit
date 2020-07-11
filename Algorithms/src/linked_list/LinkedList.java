package linked_list;

//Done

class Node
{
	int data;
	Node next;
	
	public Node(int data) 
	{
		this.data = data;	
	}
}

class LinkedList 
{
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
	
	public void print() 
	{
		Node current = head;
		while(current.next != null) 
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println(current.data+" ");
	}
	
	public static void main(String args[]) 
	{
		LinkedList obj = new LinkedList();
		obj.append(1);
		obj.append(2);
		obj.append(3);
		obj.append(4);
		obj.print();
		obj.deleteWithValue(2);
		obj.print();	
		obj.prepend(0);
		obj.print();	
	}
}