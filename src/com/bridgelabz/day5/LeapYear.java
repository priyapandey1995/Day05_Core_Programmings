package com.bridgelabz.day5;

import java.util.Scanner;

public class LeapYear {
	/*
	 * if the given year is divisible by 4 ,100 and 400 then its leap year
	 * if statement is used to perform the above condition
	 */

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the year");
			int year=sc.nextInt();
			if(year%4==0 && year%100==0&& year%400==0)
			{
				System.out.println(year+ " " + "year is leap year");
			}
			else
			{
				System.out.println(year+ " " + "year is not a leap year");
			}
					
		
		}


	}


