package com.bridgelabz.day5;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		/*
		 * Suppose to find the quotient and remainder by modulus operator
		 */
		Scanner sc=new Scanner(System.in);
		int remainder;
		int quotient;
		int result;
		System.out.print("Enter the Divident");
		int a=sc.nextInt();
		System.out.print("Enter the  Divisor");
		int b=sc.nextInt();
		remainder=a%b;
		System.out.println("display remainder value" +" " + remainder );
		quotient=a/b;
		System.out.println("display quotient"  + " "+ quotient);
				
	}

}
