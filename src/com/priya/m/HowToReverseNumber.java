package com.priya.m;

public class HowToReverseNumber {

	public static void main(String[] args) {
		int number = 123;
		int revNum = 0;
		while(number != 0)
		{
			int rem = number%10;
			revNum = revNum*10+rem;
			number = number/10;
			
		}
		System.out.println(revNum);
	}

}
