package com.priya.m;

import java.util.Scanner;

public class FindMaxValueInArrayUsingScanner {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array====");
		  int size = scn.nextInt();
		int[]a = new int[size];
		
		System.out.println("enter the arrayy:------" + "  ");
		for(int i = 0; i<a.length;i++)
		{
			a[i] = scn.nextInt();
		}
		int max = 0;
		for(int i =0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		System.out.println("maximum value :====="   +   max);
		
	}

}
