package com.class11;

import java.util.Scanner;

public class BigHomework5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentense");

		String a = scan.nextLine(); // taking string sentence from user
		String b[] = a.split(" "); // Splitting it by " " (space)
		String c = ""; // empty string where we will save reversed one
		for (int i = b.length - 1; i >= 0; i--) {
			c = c + b[i] + " ";
			// taking word by word starting with
			// last one and putting into new string with " "

		}

		System.out.println(c); // result

	}

}
