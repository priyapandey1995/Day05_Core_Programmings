package com.bridgelabz.day5;

import java.util.Scanner;

public class CalculatePowerOfTwo {

	public static void main(String[] args) {
		
			/*
			 * power of two is printed until it satisfy the condition
			 * i.e.n<=31
			 */
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The number");
			int n=sc.nextInt();
			while(n<=31) {
			for(int i=1;i<=n;i++)
			{
				System.out.println("2 X "+ i + "=" +2*i);
			}
			n++;
			
			}
			

	}

}
