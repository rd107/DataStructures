package org;

public class DeletionArray 
{
	public static void main(String[] args) 
	{
		int []marr = {1,8,2,3};
		
		int pos = 2;
		
		int element = 8;
		
		for(int i=0;i<marr.length;i++)
		{
			if(marr[i]==element)
			{
				for(int j=i;j<marr.length-1;j++)
				{
					marr[j]=marr[j+1];
				}
			}
		}
		
		for(int i:marr)
		{
			System.out.println(i);
		}
	}
}
