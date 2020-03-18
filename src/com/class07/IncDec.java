package com.class07;

import java.util.Scanner;

public class IncDec {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean a = true;

		while (a) {

			System.out.println("Enter your lucky number 1-20 ");
			int num = scan.nextInt();
			if (num == 17) {
				System.out.println("You are millioner");
				a = false;
			} else if (num == 0) {
				a = false;
			} else {
				System.out.println("Sorry try again or type 0 to quit");
			}

		}

	}
}
