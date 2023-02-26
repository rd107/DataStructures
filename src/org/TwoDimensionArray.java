package org;

import java.util.Scanner;

public class TwoDimensionArray 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int [][]twodimarr = new int[2][2];
		
		for(int row=0;row<2;row++)
		{
			for(int col=0;col<2;col++)
			{
				twodimarr[row][col] = userInput.nextInt();
			}
		}
		
		for(int row=0;row<2;row++)
		{
			for(int col=0;col<2;col++)
			{
				System.out.println(twodimarr[row][col]);
			}
		}
		
		userInput.close();
	}
}
