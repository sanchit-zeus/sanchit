package linked_list;

public class LinkedListGeeks 
{
	static class Node
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
	
	public static void insert(int data)
	{
		if(head == null)
		{
			head = new Node(data);
			return;
		}
		
		Node current = head;
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public static void print()
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
	
	public static void deleteValue(int data)
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

	public static int length()
	{
		Node current = head;
		int count = 1;
		while(current.next != null)
		{
			count++;
			current = current.next;
		}
		return(count);
	}
	
	public static int getNth(int index)
	{
		Node current = head;
		int count = 0;
		
		while(current != null)
		{
			if(count == index)
				return (current.data);
			
			count++;
			current = current.next;
		}
		return count;
	}
	
	public static int getNthFromEnd(int index)
	{
		int length = length();
		int n = length - index;
		
		int i = 0;
		Node current = head;
		
		while(i < n)
		{
			current = current.next;
			i++;
		}
		return(current.data);
	}
	
	public static int middle()
	{
		Node slow = head,fast = head;
		
		while(fast != null && fast.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return(slow.data);
	}
	
	public static void main(String[] args) 
	{
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		middle();
	}
}
