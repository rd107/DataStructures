package org;

public class StackTest 
{
	int maxsize = 10;
	int []stack = new int[10];
	int top =-1;
	
	public void push(int element)
	{
		stack[++top] = element; 
	}
	
	public int pop()
	{
		return stack[top--];
	}
	
	public int peek()
	{
		return stack[top];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top == (10-1));
	}
	
	public static void main(String[] args) 
	{
		StackTest st = new StackTest();
		
		st.push(10);
		
		st.push(50);
		
		System.out.println(st.peek());
		
		st.pop();
		
		System.out.println(st.peek());
		
		
	}
}
