package linked_list;

//done

public class InsertAtTailLinkedList 
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
		System.out.print(current.data);
	}
	
	Node insertNodeAtTail(Node head, int data)
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
		return head;
	}

	public static void main(String[] args) 
	{
		InsertAtTailLinkedList obj = new InsertAtTailLinkedList();
		System.out.println(obj.insertNodeAtTail(head,1).data);
		System.out.println(obj.insertNodeAtTail(head,2).data);
		System.out.println(obj.insertNodeAtTail(head,3).data);
		System.out.println(obj.insertNodeAtTail(head,4).data);
		System.out.println(obj.insertNodeAtTail(head,5).data);
		System.out.println(obj.insertNodeAtTail(head,6).data);
	}
}
