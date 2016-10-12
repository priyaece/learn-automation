package com.priya.m;

public class FindMiniumValueOfArray {

	public static void main(String[] args) {
		int[] arr = {-34567890,10,2,78,90,56,879,1,-89,-23,-76,-2345};
		int min = Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
