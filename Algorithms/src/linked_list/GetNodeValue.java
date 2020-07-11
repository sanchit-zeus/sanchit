package linked_list;

//done

public class GetNodeValue {
	
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
		System.out.println();
	}
	
	static int length(int positionFromTail)
	{
    	Node current = head;
    	int count = 1;

    	while(current.next != null)
    	{
    		count++;
    		current = current.next;    		
    	}
    			
		return count - positionFromTail;
	}
	
    static int getNode(Node head,int positionFromTail) 
    {
    	Node current = head;
    	int i = length(positionFromTail);
    	
    	for (int j = 0; j < i - 1; j++) 
    	{
    		current = current.next;			
		}
    	
		return current.data;
    }

	public static void main(String[] args) 
	{
		GetNodeValue obj = new GetNodeValue();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		System.out.println(getNode(head,1));
	}
}
