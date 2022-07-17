package com.bridgelabz.day5;

import java.util.Scanner;

public class PrimeFactor {
	/*
	 * prime factor is determined by applying for loop,
	 * and the number should be traversed till i*i<=n
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		for(int i=2; i * i<=n; i++) {
			while(n % i == 0) {
				n=n /i;
				System.out.print(i + " " );
			}
		}
		if(n!=1) {
			System.out.print(n);
		}

	}

}
