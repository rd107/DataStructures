package org;

public class SearchLinkedList 
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
	
	public void searchLinkedList(int key)
	{
		Node current = head;
		int count = 1;
		
		while(current!=null)
		{
			if(current.data==key)
			{
				System.out.println("Element found at: "+count);
			}
			current=current.next;
			count++;
		}
		
	}
	
	public static void main(String[] args) 
	{
		SearchLinkedList ll = new SearchLinkedList();
		
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		
		ll.displayNode();
		
		ll.searchLinkedList(2);
	}
}
