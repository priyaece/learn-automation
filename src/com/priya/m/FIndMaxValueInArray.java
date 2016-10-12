package com.priya.m;

public class FIndMaxValueInArray {
	public static void main(String[] args) {
		int max = 0;
		int[] arr ={67,89,90,45,27,10099,6,89,2};
		for(int i = 0; i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
}
	


 