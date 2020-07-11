package linked_list;

public class ReverseDoublyLinkedList 
{

	class Node
	{
		int data;
		Node next, prev;
		
		Node(int data)
		{
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	Node head;
	
	void insert(int data)
	{
		Node new_node = new Node(data); 
		  
        Node last = head; 
        new_node.next = null; 
  
        
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
  

        while (last.next != null) 
            last = last.next; 
  
        last.next = new_node; 
  
        new_node.prev = last; 
	}
	
	public void printlist(Node node) 
    { 
        Node last = null; 
        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
        
        while (last != null) 
        { 
            System.out.print(last.data + " "); 
            last = last.prev; 
        }
    }
	
	void reverse() 
	{ 
        Node temp = null; 
        Node current = head; 
  
       
        while (current != null) { 
            temp = current.prev; 
            current.prev = current.next; 
            current.next = temp; 
            current = current.prev; 
        } 
  
        if (temp != null) { 
            head = temp.prev; 
        } 
    } 
	
	public static void main(String[] args)
	{
		
	

	}
}
