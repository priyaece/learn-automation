package com.priya.m;

public class Delete {

	public static void main(String[] args) 
	{
		int[] arr ={1,2,2,1,3,2,};
		   //int j = 0;
		   for(int i = 0;i<arr.length;i++)
		   {
			   for(int j = i+1;j<arr.length;j++)
			   {
				   if(arr[i] == arr[j])
				   {
					   System.out.println(arr[i]);
				   }
			   }
		   }
	}
}