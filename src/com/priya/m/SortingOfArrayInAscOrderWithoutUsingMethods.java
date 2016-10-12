package com.priya.m;

public class SortingOfArrayInAscOrderWithoutUsingMethods {

	public static void main(String[] args) {
		int[]arr = {12,6,0,45,32,23,65,54,30,98};
		int temp;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println("sorted array");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}
