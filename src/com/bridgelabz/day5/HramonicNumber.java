package com.bridgelabz.day5;

import java.util.Scanner;

public class HramonicNumber {

	public static void main(String[] args) {
		
			/*
			 * to print Nth harmonic value,
			 * firstly ,the number which is entered should not be equal to 0
			 * then,the loop is used to print the harmonic value
			 */
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number");
			int number=sc.nextInt();
			double nthHarmonic=0;
			if(number!=0){
				for(int i=1;i<=number;i++) {
					System.out.print("1/" + i + " "  );
				    nthHarmonic+=1/(double)i;
				}
			
			}
			else {
				System.out.println("limit should be more than 0");
			}
			System.out.println("=" + nthHarmonic);

	}

}
