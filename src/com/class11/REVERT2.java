package com.class11;

import java.util.Scanner;

public class REVERT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scan.next();

		if (!str.isEmpty()) {
			if (str.length() >= 3 && str.length() % 2 != 0) {
				System.out.println(str.charAt((str.length() - 1) / 2));
			} else {
				System.out.println("Does not follow requirements");
			}
		} else {
			System.out.println("Line is empty");
		}

	}

}
