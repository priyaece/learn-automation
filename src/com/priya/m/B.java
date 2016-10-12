package com.priya.m;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = new int[5];
		int[]c = new int[5];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First array");
		for(int i = 0;i<5;i++)
		{
			a[i] = scn.nextInt();
		}
		System.out.println("Enter Second arrays");
		for(int i = 0;i<5;i++)
		{
			b[i] = scn.nextInt();
		}
		/*System.out.println("Array before swapping");
		System.out.println("First Arrays:");
		for(int i = 0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Second Arrays:");
		for(int i = 0;i<5;i++)
		{
			System.out.print(b[i]);
		}**/
	}

}
