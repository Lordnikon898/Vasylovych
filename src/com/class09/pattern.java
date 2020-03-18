package com.class09;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();

		}
		

		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(i);
			}
			System.out.println();

		}
	}
}