package com.class11;

public class BigHomework7 {

	public static void main(String[] args) {
		// sec largest max and min

		int[] arr = { -24,25,61,12, 3, 5, 7, 4, 673, 631 };
		int min = arr[0], max = 0, sec = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				sec = max;
				max = arr[i];

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				sec = max;
				max = arr[i];

			}
			else if (arr[i] > sec && arr[i] != max) {
				sec = arr[i];

			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		

		System.out.println("Minimum =" + min);
		System.out.println("Second lar =" + sec);
		System.out.println("Maximum =" + max);

	}

}
