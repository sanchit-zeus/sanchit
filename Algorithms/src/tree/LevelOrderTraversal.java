package tree;

public class LevelOrderTraversal 
{
	static class Node
	{
		int key;
		Node left, right;
		
		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}
	
	static Node root;
	
	public static void insert(int key)
	{
		root = insertRec(root, key);
	}
	
	public static void inOrder()
	{
		inOrderRec(root);
	}

	private static Node insertRec(Node root, int key) 
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		if(key < root.key)
			root.left = insertRec(root.left, key);
		else if(key > root.key)
			root.right = insertRec(root.right, key);
		
		return root;
	}
	
	private static void inOrderRec(Node root) 
	{
		if(root != null)
		{
			inOrderRec(root.left);
			System.out.print(root.key+" ");
			inOrderRec(root.right);
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
				return (lHeight + 1);
			else
				return (rHeight + 1);
		}
	}
	
	public static void printGivenLevel(Node root, int level)
	{
		if(root == null)
			return;
		if(level == 1)
			System.out.print(root.key+" ");
		else if(level > 1)
		{
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}
	
	public static void levelOrder(Node root) 
	{
		int height = height(root);
		
		for (int i = 1; i <= height; i++) 
			printGivenLevel(root, i);
    }

	public static void main(String[] args) 
	{
		insert(1);
		insert(41);
		insert(85);
		insert(7);
		insert(9);
		insert(23);
		insert(90);
		insert(67);
		insert(45);
		levelOrder(root);
	}
}
