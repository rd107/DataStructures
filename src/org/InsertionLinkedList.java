package org;

public class InsertionLinkedList 
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
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
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
		
		while(current!=null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void insertionHeadLinkedList(int data)
	{
		Node newNode = new Node(data);
		
		Node current = head;
		
		newNode.next=head;
		head=newNode;
	}
	
	public void insertionLinkedList(int index,int data)
	{
		Node newNode = new Node(data);
		Node temp = head;;
		
		Node current = head;
			
		for(int i=0;i<=index-2;i++)
		{
			temp = temp.next;
		}
		
		for(int i=0;i<=index-1;i++)
		{
			current = current.next;
		}
			
		temp.next=newNode;
		newNode.next=current;
	}
	
	public static void main(String[] args) 
	{
		InsertionLinkedList ll = new InsertionLinkedList();
		
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		
		ll.displayNode();
		
		ll.insertionLinkedList(2, 5);
		
		ll.displayNode();
	}
}
