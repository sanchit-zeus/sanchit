package linked_list;

//Done

class LNode
{
	int data;
	LNode next;
	
	public LNode(int data) 
	{
		this.data = data;	
	}
}

class PrintLinkedList 
{
	LNode head;
	public void append(int data) 
	{
		if(head == null) 
		{
			head = new LNode(data);
		}
		LNode current = head;
		while(current.next != null) 
		{
			current = current.next; 
		}
		
		current.next = new LNode(data);	
	}
	
	public void prepend(int data) 
	{
		LNode newHead = new LNode(data);
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
		
		LNode current = head;
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
		LNode current; 
		current = head;
		while(current.next != null) 
		{
			System.out.println(current.next.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) 
	{
		PrintLinkedList obj = new PrintLinkedList();
		obj.append(1);
		obj.append(2);
		obj.append(3);
		obj.append(4);
		obj.append(5);
		obj.append(6);
		obj.print();
	}
}

