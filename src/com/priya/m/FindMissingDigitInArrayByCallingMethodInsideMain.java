package com.priya.m;
/**
 * 
 * @author Priya
 * THIS PROGRAM IS APPLICABLE FOR SORTED ARRAY
 * IF ARRAY IS NOT SORTED THEN FIRST WE HAVE TO SORT IT.
 *
 */
public class FindMissingDigitInArrayByCallingMethodInsideMain {
	static int[] ar = {1,3,5,8,43,44};

	public static void main(String[] args) {
		displayMissing();
		
	}
	static public void displayMissing()
	{
		System.out.print("giving aaryy");
		for(int j = 0; j<ar.length; j++)
		{
			System.out.print(ar[j] + " ");
		}
		System.out.println("number missing between 1 to 100 in array");
		  int j = 0;
		  for(int i = 1; i<=50;i++)
		  {
			  if(j<ar.length && i == ar[j])
			  {
				  j++;
			  }
			  else
			  {
				  System.out.print(i + "  ");
			  }
		  }
	}

}
