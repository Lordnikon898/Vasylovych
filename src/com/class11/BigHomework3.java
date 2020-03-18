package com.class11;

public class BigHomework3 {

	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series.
		int a = 0;
		int b = 1;
		int c = 0;

		int count = 0;
		while (count < 11) {
			c = a + b;
			System.out.println(c);
			
			a = b;
			b = c;
			count++;

		}

	}

}
