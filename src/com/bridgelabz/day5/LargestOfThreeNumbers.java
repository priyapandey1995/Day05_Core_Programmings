package com.bridgelabz.day5;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		/*
		 * three numbers are entered by user and largest number is found among them
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:");
		int first=sc.nextInt();
		
		System.out.print("Enter Second Number:");
		int second=sc.nextInt();
		
		System.out.print("Enter Three Number:");
		int three=sc.nextInt();
		
		if((first>second && first>three))
		{
			System.out.print(first +" " + " is largest among others");
		}
		else if(second>first && second>three)
		{
			System.out.print(second +" "+ "is largest among others");
		}
		else
		{
			System.out.print(three +" "+ "is largest among others");
		}

	}

}
