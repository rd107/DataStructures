package org;

public class DoublyLinkedList 
{
	class Node
	{
		int data;
		Node previous;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.previous=null;
			this.next=null;
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
			newNode.previous=tail;
			tail=newNode;
			
		}
	}
	
	public void displayNode()
	{
		Node current = head;
		
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public static void main(String[] args) 
	{
		DoublyLinkedList ll = new DoublyLinkedList();
		
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		
		ll.displayNode();
	}
}
