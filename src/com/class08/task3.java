package com.class08;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range (start point and end point)");
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int sum1=0;
		int sum2=0;

		for (int i = s1; i <= s2; i++) {

			if (i % 2 != 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}

		}
		
		System.out.println("Even sum = " + sum2);
		System.out.println("Odd sum = " + sum1);
	}

	}



