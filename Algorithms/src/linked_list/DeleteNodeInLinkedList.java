package linked_list;

//Done

class BNode
{
	int data;
	BNode next;
	
	BNode(int data)
	{
		this.data = data;
	}
}

public class DeleteNodeInLinkedList 
{
	static BNode head;
	
	void insert(int data)
	{
		if(head == null)
		{
			head = new BNode(data);
		}
		else
		{
			BNode current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = new BNode(data);
		}
	}
	
    BNode deleteWithIndex(BNode head, int position) 
    {
    	if (head == null)
    	{
    		return head;
    	}
    	else if(position < 1)
    	{
    		head = head.next;
     		return head;
    	}
    	else
    	{
    		int count = 0;
    		BNode current = head;
    		
    		while(count < position - 1)
    		{
    			current = current.next;
    			count++;
    		}
    		current.next = current.next.next;
    		return head;
    	}
	}
	
	void deleteWithValue(int data)
	{
		if(head == null)
			return;
		
		if(head.data == data)
		{
			head = head.next;
			return;
		}
		
		BNode current = head;
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
	
	void print() 
	{
		BNode current = head;
		while(current.next != null) 
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println(current.data);
	}

	public static void main(String[] args) 
	{
		DeleteNodeInLinkedList obj = new DeleteNodeInLinkedList();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		obj.insert(7);
		obj.insert(8);
//		obj.print();
//		obj.deleteWithValue(4);
		obj.print();
		obj.deleteWithIndex(head,0);
		obj.print();
	}
}
