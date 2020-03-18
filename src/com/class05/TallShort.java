package com.class05;

import java.util.Scanner;

public class TallShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("How tall you are???");
		int h = in.nextInt();

		if (h >= 60) {
			System.out.print("You short :( ");
		} else if (h > 60 && h <= 72) {
			System.out.print("Medium");
		} else if (h > 72) {
			System.out.print("Medium");
		}

	}

}
