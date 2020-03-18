package com.class08;

public class OddEven {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i < 100; i++) {

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
