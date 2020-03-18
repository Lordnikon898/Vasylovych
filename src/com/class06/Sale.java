package com.class06;

import java.util.Scanner;

public class Sale {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean sale;
		double price = 0;
		double discount = 0;
		double finelPrice;

		System.out.println("Is there sale?");
		sale = scan.nextBoolean();
		if (sale == true) {
			System.out.print("How much?");
			price = scan.nextDouble();
			
			if (price < 20) {
				discount = 0.1;

			} else if (price >= 20 && price < 100) {
				discount = 0.2;
			} else if (price >= 100 && price <= 500) 
			{
				discount = 0.3;
			} 
			else {	discount = 0.5;}

		}

		else {
			System.out.println("Sorry not today then");
		}
		
		if (sale) {
			finelPrice = price * discount;
			System.out.println("Cost of purchase is " + price + " + discount added= " + discount + " Final price is = "
					+ finelPrice);

		}

	}
}
