package com.class11;

import java.util.Scanner;

public class BigHomework6 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String a = scan.next();
		String b = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			b += a.charAt(i);
		}
		if (b.equalsIgnoreCase(a)) {
			System.out.println("This sentence is palindrome");
		} else {
			System.out.println("Not your day sorry :(");

		}

	}

}
