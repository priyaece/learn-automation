package com.priya.m;
/**
 * 
 * @author Priya
 *REVERSE THE DIGIT
 */

public class HowToReverseANumber2 {

	public static void main(String[] args) {
		HowToReverseANumber2 no = new HowToReverseANumber2();
		   //no.reverseNumber(123);
		   System.out.println("reverse number:===" +  no.reverseNumber(123));
		
	}
	public int reverseNumber(int number)
	{
		int rev = 0;
		while(number != 0)
		{
			int rem = number%10;
			rev = rev*10 + rem;
			number = number/10;

			}
		return rev;
	}

}
