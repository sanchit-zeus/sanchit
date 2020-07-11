package tree;

//Done

public class LowestCommonAncestor
{
	class Node
	{
		int data;
		Node left, right;
		
		Node (int data)
		{
			this.data = data;
			left = right = null;
		}
	}

	Node root;
	
	void insert(int data)
	{
		root = insertRec(root, data);
	}
	
	Node insertRec(Node root, int data) 
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		if(root.data > data)
			root.left = insertRec(root.left, data);
		else if(root.data < data)
			root.right = insertRec(root.right, data);
		
		return root;
	}
	
	void inOrder()
	{
		inOrderRec(root);
	}

	void inOrderRec(Node root) 
	{
		if(root != null)
		{
			inOrderRec(root.left);
			System.out.print(root.data+" ");
			inOrderRec(root.right);
		}
	}
	
	public static Node lca(Node root, int v1, int v2) 
    {
		if(root == null)
			return null;
		
		if(root.data > v1 && root.data > v2)
			return lca(root.left,v1,v2);
		
		if(root.data < v1 && root.data < v2)
			return lca(root.right,v1,v2);
		
		return root;
    }
	
	public static void main(String[] args) 
	{
		LowestCommonAncestor obj = new LowestCommonAncestor();
		
		int v1 = 1, v2 = 7;
		
		obj.insert(4);
		obj.insert(2);
		obj.insert(3);
		obj.insert(1);
		obj.insert(7);
		obj.insert(6);
		System.out.println(lca(obj.root,v1,v2).data);
	}
}
