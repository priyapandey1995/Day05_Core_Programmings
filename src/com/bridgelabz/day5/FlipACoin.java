package com.bridgelabz.day5;
import java.util.Scanner;

public class FlipACoin {
	

			public static void main(String[] args) {
				/*
				 * random function is used to find the times of coin flips
				 */
				
				Scanner sc=new Scanner(System.in);
				int headCount=0;
				int tailCount=0;
				double Heads;
				double Tails;
				int numberOfFlips;
				System.out.println("Enter the no of times the coin filps");
				numberOfFlips=sc.nextInt();
				for(int i=0;i<=numberOfFlips;i++)
				{
					double random=Math.random();
					if(random <0.5)
					
						headCount++;
					else
						tailCount++;
					
				}
				Heads=headCount/(double) numberOfFlips *100;	
				System.out.println("Percentage of Head is "+Heads);
				
				Tails=tailCount/(double)numberOfFlips * 100;
				System.out.println("Percentage of Tails is" + Tails);

		}
		}


	


