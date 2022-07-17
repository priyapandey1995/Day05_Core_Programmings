package com.bridgelabz.day5;

import java.util.Scanner;

public class VowelsAndConsonents {

	public static void main(String[] args) {
		/*
		 * vowels and consonents can be find by applying switch statements
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a charater");
		char ch=sc.next().charAt(0);
				
		if(ch == 'a'||ch== 'e'||ch == 'i'||ch == 'o'||ch == 'u')
		{
			System.out.println(ch + " is a Vowels");
			
		}
		else
		{
			System.out.println(ch + " is a consonents");
		}

	}

}
