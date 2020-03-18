package com.class08;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {

		double productPrice;
		double insertTotal = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price of product");
		productPrice = scan.nextDouble();

		while (productPrice > insertTotal) {

			System.out.println("Please insert money");
			insertTotal = insertTotal + scan.nextDouble();

			if (insertTotal >= productPrice) {

				System.out.println("Paid! hank you for shopping!");
				System.out.println("Your change is = " + (productPrice - insertTotal) * -1);

			} else {
				System.out.println((productPrice - insertTotal) + " = left to pay off the amount");
			}

		}

	}

}
