package com.bridgelabz.day5;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		/*
		 * by taking swap as temporary variable,swapping of two number is done
		 */
		int swap=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number:");
		int numberOne=sc.nextInt();
		System.out.println("Enter Second Number");
		int numberTwo=sc.nextInt();
		System.out.println("before swaping number is " +numberOne+" " +numberTwo);
			swap=numberOne;
			numberOne=numberTwo;
			numberTwo=swap;
		System.out.println("After swaping the number is " +numberOne +" " + numberTwo);
			
			

	}

}
