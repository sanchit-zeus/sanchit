package tree;

//Done

class PreorderTraversal
{
	class Node
	{
		int key;
		Node left, right;
		
		Node(int item)
		{
			key = item;
			left = null; right = null;
		}
	}
	
	Node root;
		
	PreorderTraversal()
	{
		root= null;	
	}
		
	void insert(int key) 
	{ 
		root = insertRec(root, key); 
	} 
	
	Node insertRec(Node root, int key) 
	{ 
		if (root == null) 
		{
			root = new Node(key); 
			return root; 
		} 

		if (key < root.key) 
			root.left = insertRec(root.left, key); 
		else if (key > root.key) 
			root.right = insertRec(root.right, key); 
		return root; 
	} 

	void preOrder(Node root) 
	{ 
		if (root != null) 
		{
			System.out.print(root.key+" "); 
			preOrder(root.left); 
		    preOrder(root.right); 
		} 
	} 
	
	void postOrder(Node root)
	{
		if(root != null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key+" ");
		}
	}
	
	void inOrder(Node root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
	}

	public static void main(String[] args) 
	{
		PreorderTraversal obj = new PreorderTraversal();
		obj.insert(5);
		obj.insert(3);
		obj.insert(4);
		obj.insert(2);
		obj.insert(7);
		obj.insert(6);
		obj.insert(8);
		obj.preOrder(obj.root);	
		System.out.println();
		obj.inOrder(obj.root);
		System.out.println();
		obj.postOrder(obj.root);
		System.out.println();
	}
}
