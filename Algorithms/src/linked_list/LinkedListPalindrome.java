package linked_list;

//Done

import java.util.Stack;

public class LinkedListPalindrome 
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			s.push(data);
			this.data = data;
		}
	}
	
	Node head;
	static Stack<Integer> s = new Stack<Integer>();
	
	void append(int data)
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
	
	void prepend(int data)
	{
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	void deleteWithValue(int data)
	{
		if(head == null)
			return;
		
		if(head.data == data)
		{
			head.next = head;
			return;
		}
		
		Node current = head;
		
		while(current != null)
		{
			if(current.next.data == data)
			{
				current.next.next = current.next;
				return;
			}
			current = current.next;
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
	
	String palindrome()
	{
		Node current = head;
		
		while(current.next != null) 
		{
			if(current.data == s.pop())
			{
				current = current.next;
			}
			else
			{
				System.out.println();
				return "Not a Palindrome";
			}
			
		}
		return "Is a Palindrome";
		
	}
	
	public static void main(String[] args) 
	{
		LinkedListPalindrome obj = new LinkedListPalindrome();
		obj.append(1);
		obj.append(2);
		obj.append(3);
		obj.append(2);
		obj.append(1);
		obj.print();
		System.out.println(obj.palindrome());
	

	}
}
