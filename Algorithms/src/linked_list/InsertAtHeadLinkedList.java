package linked_list;

//done

public class InsertAtHeadLinkedList 
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
	
	Node insertNodeAtHead(Node head, int data)
	{
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
//		System.out.println(head.data);
		return head;
	}

	public static void main(String[] args) 
	{
		InsertAtHeadLinkedList obj = new InsertAtHeadLinkedList();
//		obj.insert(6);
//		obj.insert(7);
//		obj.insert(8);
//		obj.insert(9);
//		obj.insert(10);
//		obj.print();
		System.out.println(obj.insertNodeAtHead(head,383).data+" ");
		System.out.println(obj.insertNodeAtHead(head,484).data+" ");
		System.out.println(obj.insertNodeAtHead(head,392).data+" ");
		System.out.println(obj.insertNodeAtHead(head,975).data+" ");
		System.out.println(obj.insertNodeAtHead(head,321).data+" ");
	}
}
