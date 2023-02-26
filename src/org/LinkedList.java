package org;

public class LinkedList 
{
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		public Node()
		{
			
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void displayNode()
	{
		Node current = head;
		
		if(head==null)
		{
			System.out.println("Empty list");
		}
		
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		
		ll.displayNode();
	}
}
