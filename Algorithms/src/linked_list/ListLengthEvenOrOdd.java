package linked_list;

//Done

class ANode
{
	int data;
	ANode next;
	
	ANode(int data)
	{
		this.data = data;
	}
}

public class ListLengthEvenOrOdd 
{	
	ANode head;
	
	void insert(int data)
	{
		if(head == null)
		{
			head = new ANode(data);
		}
		else
		{
			ANode current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = new ANode(data);
		}
	}
	
	String oddOrEven()
	{
		ANode current = head;
		int flag = 1;
		while(current.next != null)
		{
			current = current.next;
			flag++;
		}
		
		if(flag % 2 == 0)
			return "Even";
		else
			return "Odd";
	}
	
	public static void main(String[] args) 
	{
		ListLengthEvenOrOdd obj = new ListLengthEvenOrOdd();
		int n = 6;
		
		for (int i = 0; i < n; i++) 
			obj.insert(i);
		
		System.out.println(obj.oddOrEven());
	}
}
