package linked_list;

//done

public class CompareTwoLinkedLists 
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
		System.out.println(current.data+" ");
	}
	
	void deleteWithValue(int data)
	{
		if(head == null)
		{
			return;
		}
		else if(head.data == data)
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
	
	static boolean compareLength(Node current1, Node current2)
	{
		int count1 = 1, count2 = 1;
    	
		while(current1.next != null)
    	{
    		count1++;
    		current1 = current1.next;
    	}
    	
    	while(current2.next != null)
    	{
    		count2++;
    		current2 = current2.next;
    	}
    	if(count1 == count2)
    		return true;
    	else
    		return false;
	}
	
    static boolean compareLists(Node head1, Node head2) 
    {    	
    	Node current1 = head1, current2 = head2;
    	    	    	
    	if(compareLength(current1, current2) == true)
    	{
    		while(current1.next != null && current1.next != null)
        	{    			
        		if(current1.data == current2.data)
        		{
        			current1 = current1.next;
        			current2 = current2.next;
        		}
        		else
        		{
        			return false;
        		}
        	}
    	} 
    	else if(compareLength(current1, current2) == false)
    	{
    		return false;
    	}
    	
		return true;
    }

	public static void main(String[] args) 
	{
		CompareTwoLinkedLists obj1 = new CompareTwoLinkedLists();
		CompareTwoLinkedLists obj2 = new CompareTwoLinkedLists();
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
//		obj1.print();
//		obj2.print();
		System.out.println(compareLists(obj1.head,obj2.head));
	}
}
