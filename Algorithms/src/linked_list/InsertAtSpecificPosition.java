package linked_list;

//Done

public class InsertAtSpecificPosition 
{
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
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
	}
	
	Node insertNodeAtPosition(Node head, int data, int position)
	{
		Node newNode = new Node(data);
		Node current = head; 
		int i = 0;
		
		while(i < position - 1)
		{
			current = current.next;
			i++;
		}
		newNode.next = current.next;
		current.next = newNode;
		return head;
	}

	public static void main(String[] args) 
	{
		InsertAtSpecificPosition obj = new InsertAtSpecificPosition();
		obj.insert(1);
		obj.insert(2);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		obj.print();
		System.out.println();
		obj.insertNodeAtPosition(head,3,2);
		obj.print();
	}
}
