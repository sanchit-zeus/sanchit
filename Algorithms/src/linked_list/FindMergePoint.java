package linked_list;

 

public class FindMergePoint 
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
	
	static int getCount(Node head)
	{
		Node current = head;
		int count = 1;
		
		while(current.next != null)
		{
			count ++;
			current = current.next;
		}
		return count;	
	}
	
	 static int findMergeNode(Node head1,Node head2) 
	 {
		 Node current1 = head1;
		 Node current2 = head2;
		 int c1 = getCount(head1);
		 int c2 = getCount(head2);
		 int d;
		 
		 if(c1 > c2)
		 {
			d  = c1 - c2;
			for (int i = 0; i < d; i++) 
			{
				if(current1 == null)
				{
					return 0;
				}
				current1 = current1.next;
			}
			
			while(current1 != null && current2 != null)
			{
				if(current1.data == current2.data)
				{
					return current1.data;
				}
				current1 = current1.next;
				current2 = current2.next;
			}
			return 0;			 
		 }
		 
		 else if(c2 > c1)
		 {
			 d = c2 - c1;
			 for (int i = 0; i < d; i++) 
			 {
				 if(current2 == null)
				 {
					 return 0;
				 }
				 current2 = current2.next;
			 }
			 
			 while(current1 != null && current2 != null)
			 {
				 if(current1.data == current2.data)
				 {
					 return current1.data;
				 }
				 current1 = current1.next;
				 current2 = current2.next;
			 }
			 return 0;
		 }
		return 0;
	 }

	public static void main(String[] args) 
	{
		FindMergePoint obj1 = new FindMergePoint();
		FindMergePoint obj2 = new FindMergePoint();
		obj1.insert(1);
		obj1.insert(2);
		obj1.insert(3);
		obj2.insert(1);
		obj2.head.next = obj1.head.next;
		obj1.print();
		System.out.println(findMergeNode(obj1.head, obj2.head));
	}
}
