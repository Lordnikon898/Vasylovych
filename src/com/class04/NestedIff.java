package com.class04;

public class NestedIff {

	public static void main(String[] args) {

		double mrtRate = 4.5;
		int priceOfHouse = 200000;

		if (mrtRate <= 4.5) {
			System.out.println("Considering buying house");
			if (priceOfHouse <= 200000) {
				System.out.println("Will pay cash");
			} else {
				System.out.println("Will get mortage");
			}
		} else {
			System.out.println("Not today");
		}

	}

}
