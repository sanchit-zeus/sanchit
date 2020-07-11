package linked_list;

//Done

 class FNode
 {
	 int data;
	 FNode next;
	 
	 FNode(int data)
	 {
		 this.data = data;
		 next = null;
	 }
 }

public class ReverseLinkedListInGroups 
{
	FNode head;
	
	void append(int data)
	{
		if(head == null)
		{
			head = new FNode(data);
		}
		else
		{
			FNode current = head;
			
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = new FNode(data);
		}
	}
	
	void prepend(int data)
	{
		FNode newHead = new FNode(data);
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
		
		FNode current = head;
		
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
		FNode current = head;
		while(current.next != null) 
		{
			System.out.print(current.data);
			current = current.next;
		}
		System.out.print(current.data);
		System.out.println();
	}
	
	void reverseInGroups(int k)
	{
		FNode current, previous, next;
		current = head;
		previous= null;
		
		int i = 0;
		while(i != k)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			i++;
		}	
		head = previous;
	}
	
	public static void main(String[] args) 
	{
		ReverseLinkedListInGroups obj = new ReverseLinkedListInGroups();
		obj.append(1);
		obj.append(2);
		obj.append(3);
		obj.append(4);
		obj.append(5);
		obj.print();
		obj.reverseInGroups(4);
		obj.print();
	}
}
