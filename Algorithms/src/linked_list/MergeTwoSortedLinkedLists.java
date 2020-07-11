package linked_list;

public class MergeTwoSortedLinkedLists 
{
	
//	class Node
//	{
//		int data;
//		Node next;
//		
//		Node(int data)
//		{
//			this.data = data;
//			next = null;
//		}
//	}
	
	Node head;
	
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
	
	void print(Node head)
	{
		Node current = head;
		
		while(current.next != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println(current.data+" ");
	}
	
	static Node mergeLists(Node head1, Node head2) 
	{
		Node dummyNode = new Node(0);
		Node tail = dummyNode;
		
		while(true)
		{
			if(head1 ==  null)
			{
				tail.next = head2;
				break;
			}
			if(head2 != null)
			{
				tail.next = head1;
				break;
			}
			
			if(head1.data <= head2.data)
			{
				tail.next = head1;
				head1 = head1.next;
			}
			else
			{
				tail.next = head2;
				head2 = head2.next;
			}
			tail = tail.next;
		}
		return dummyNode.next;
	}

	public static void main(String[] args) 
	{
		MergeTwoSortedLinkedLists obj1 = new MergeTwoSortedLinkedLists();
		MergeTwoSortedLinkedLists obj2 = new MergeTwoSortedLinkedLists();
		obj1.insert(1);
		obj1.insert(2);
		obj1.insert(3);
		obj1.insert(4);
		obj1.insert(5);
		obj2.insert(1);
		obj2.insert(2);
		obj2.insert(3);
		obj2.insert(4);
		obj2.insert(5);
		obj1.print(mergeLists(obj1.head,obj2.head));		
	}
}
