package org;

public class InsertionArray 
{
	public static void insert(int length,int []marr,int pos,int element)
	{
		int []newarr = new int[length];
		
		for(int i=0;i<length;i++)
		{
			if(i<pos-1)
			{
				newarr[i] = marr[i];
			}
			else if(i==pos-1)
			{
				newarr[i] = element;
			}
			else
			{
				newarr[i] = marr[i-1]; 
			}
			
		}
		
		for(int i:newarr)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) 
	{
		int []arr = {1,2,3,4};
		
		int pos = 2;
		
		int element = 8;
		
		int []arr1 = new int[arr.length+1];
		
		insert(arr1.length,arr,pos,element);
	}
}
