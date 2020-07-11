package tree;

public class HeightOfBinaryTree 
{
	class Node
	{
		int data;
		Node left, right;
		Node(int key)
		{
			data = key;
			left = right = null;
		}
	}
	
	Node root;
	
	Node insert(Node root, int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		
		if(data < root.data)
			root.left = insert(root.left,data);
		else if(data > root.data)
			root.right = insert(root.right,data);
		
		return root;
	}
	
	void inOrder(Node root)
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
      		int lDepth = height(root.left);
      		int rDepth = height(root.right);
      		
      		if(lDepth > rDepth)
      			return (lDepth + 1);
      		else
      			return (rDepth + 1);
      	}
    }
	
	public static void main(String[] args) 
	{
		HeightOfBinaryTree obj = new HeightOfBinaryTree ();
		obj.root = obj.insert(obj.root,3);
		obj.root = obj.insert(obj.root,2);
		obj.root = obj.insert(obj.root,5);
		obj.root = obj.insert(obj.root,1);
		obj.root = obj.insert(obj.root,4);
		obj.root = obj.insert(obj.root,6);
		obj.root = obj.insert(obj.root,7);
		obj.inOrder(obj.root);
		System.out.println();
		System.out.println(height(obj.root));
	}
}
