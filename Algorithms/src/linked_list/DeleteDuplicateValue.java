package linked_list;

//done

public class DeleteDuplicateValue 
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
	
	static Node head;
	
	void insert(int data)
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
	
	void print()
	{
		Node current = head;
		while(current.next != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print(current.data+" ");
		System.out.println();
	}
	
	void deleteWithValue(int data)
	{
		if(head.data == data)
		{
			head = head.next;
		}
		else
		{
			Node current = head;
			while(current.next != null)
			{
				if(current.next.data == data)
				{
					current.next = current.next.next;
				}
				else
				{
					current = current.next;
				}
			}
		}
	}
	
	static Node removeDuplicates(Node head) 
    {
		Node current = head;
		while(current.next != null)
		{
			if(current.data == current.next.data)
			{
				current.next = current.next.next;
			}
			else
			{
				current = current.next;
			}
		}
		return head;
	}

	
	public static void main(String[] args) 
	{
		DeleteDuplicateValue obj = new DeleteDuplicateValue();
		obj.insert(1);
		obj.insert(2);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.print();
		removeDuplicates(head);
		obj.print();
	}
}
