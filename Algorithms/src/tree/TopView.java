package tree;

import java.util.TreeMap;

public class TopView 
{
	private static class Node
	{
		int data;
		Node left, right;
		
		Node(int data)
		{
			this.data = data;
			left = right= null;
		}	
	}
	
	private static class Pair 
	{ 
	    int first, second; 
	
	    Pair(int i, int j) 
	    { 
	        first = i; 
	        second = j; 
	    } 
	} 
	
	static TreeMap<Integer,Pair> m= new TreeMap<Integer,Pair>(); 
	
	static Node root;
	
	public static void insert(int data)
	{
		root = insertRec(root, data);
	}
	
	private static Node insertRec(Node root, int data) 
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		
		if(data > root.data)
			root.right = insertRec(root.right,data);
		else if(data < root.data)
			root.left = insertRec(root.left,data);
		
		return root;
	}

	public static void inOrder(Node root) 
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}

	public static int height(Node root)
	{
		if(root == null)
			return 0;
		else
		{
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			
			if(lHeight > rHeight)
				return lHeight + 1;
			else
				return rHeight + 1;
		}
	}
	
	public static void topView(Node root) 
    {
		int height = height(root);
		
		
		
      
      
    }

	public static void main(String[] args)
	{
		insert(1);
		insert(2);
		insert(5);
		insert(3);
		insert(6);
		insert(4);
		inOrder(root);
		topView(root);
	}
}
