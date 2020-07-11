package linked_list;

//done

public class PrintReverseLinkedList 
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
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);
	}
	
	int numberOfElement()
	{
		Node current = head;
    	int count = 1;
    	
    	while(current.next != null)
    	{
    		count++;
    		current = current.next;
    	}
    	return count;
	}
	
    void reversePrint(Node head) 
    {
		Node current = head;
        int size = numberOfElement();
    	int arr[] = new int[size];
    	
    	while(current.next != null && size != 0)
    	{
    		arr[size - 1] = current.data;
    		current = current.next;
    		size--;
    	}
		arr[0] = current.data;
    	
    	for (int i = 0; i < arr.length; i++) 
    	{
        	System.out.println(arr[i]);
		}    	
    }

	
	public static void main(String[] args) 
	{
		PrintReverseLinkedList obj = new PrintReverseLinkedList();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
//		obj.print();
		obj.reversePrint(head);
	}
}
