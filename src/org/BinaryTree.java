package org;

class BNode
{
	int key;
	BNode left,right;
	
	public BNode(int key)
	{
		key=key;
		left=right=null;
	}
}

public class BinaryTree 
{
	BNode root;
	
	public BinaryTree(int key)
	{
		root = new BNode(key);
	}
	
	public BinaryTree()
	{
		root=null;
	}
	
	public static void main(String[] args) 
	{
		BinaryTree tree = new BinaryTree();
		
		tree.root=new BNode(1);
		tree.root.left = new BNode(2);
        tree.root.right = new BNode(3);
        tree.root.left.left = new BNode(4);
	}
}