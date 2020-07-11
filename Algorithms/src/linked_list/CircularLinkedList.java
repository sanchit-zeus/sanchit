package linked_list;

class CNode
{
	int data;
	CNode next;
	
	CNode(int data)
	{
		this.data = data;
		next = null;
	}
}

public class CircularLinkedList 
{
	CNode head;
	
	void append(int data)
	{
		if(head == null)
			head = new CNode(data);
		
		CNode current = head;
		while(current.next != head)
		{
			current = current.next;
		}
		current = new CNode(data);
	}
	
	void deleteWithValue(int data)
	{
		if(head == null)
			return;
		if(head.data == data)
		{
			head = head.next;
			return;
		}
		
		CNode current = head;
		
		while(current.next != head)
		{
			if(current.next.data == data)
			{
				current.next.next = current.next.next; 
				return;
			}
			current = current.next;
		}
	}
	
	void print()
	{
		CNode current = head;
		while(current.next != head)
		{
			System.out.println(current.data+" ");
			current = current.next;
		}
		System.out.println(current.data+" ");
	}
	
	
	public static void main(String[] args) 
	{
		CircularLinkedList obj = new CircularLinkedList();
		obj.append(1);
		obj.append(2);
		obj.append(3);
		obj.append(4);
		obj.append(5);
	}
}
