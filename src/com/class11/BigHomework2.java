package com.class11;

import java.util.Scanner;

public class BigHomework2 {

	public static void main(String[] args) {
		// prime number
		Scanner scan = new Scanner(System.in);
		boolean flag = false;

		System.out.println("Enter your number");
		int num = scan.nextInt();

		for (int y = 2; y <= num / 2; y++) {
			if (num % y == 0) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println(num + " Number is not prime");
		else
			System.out.println(num + " Number is  prime");

	}
}