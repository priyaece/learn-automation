package com.priya.m;
/**
 * 
 * @author Priya
 * THIS PROGRAM WORK ONLY FOR SORTED ARRAY
 *
 */

public class FindMissingNumberInArrayBetween1To10 {

	public static void main(String[] args) {
		int[] arr = {1,5,7,8};
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("FINDING THE MISSING NUMBER");
		int j = 0;
		for(int i =1; i<=10;i++)
		{
			if(j<arr.length && i == arr[j])
			{
				j++;
			}
			else
			{
				System.out.print(i + " ");
			}
		}
	}

}
