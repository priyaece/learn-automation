package com.priya.m;
/**
 * 
 * @author Priya
 * For FINDING THE MISSING DIGIT IN AARAY 
 * THIS PROGRAM IS APPLICABLE ONLY FOR SORTED AARAY
 *
 */

public class FindindMissingNUmberBetween1To50InArray {
	public static void main(String[] args) {
		int[] arr = {1,10,11,24,27,34,35,38,45,48,50};
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("FINDING THE MISSING NUMBER");
		int j = 0;
		int count = 0;
		for(int i = 1;i<=50;i++)
		{
			if(j<arr.length && i == arr[j])
			{
				j++;
			}
			else
			{
				System.out.println(i + "   ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println("number of missing digit:===="   + count);
	}

}
