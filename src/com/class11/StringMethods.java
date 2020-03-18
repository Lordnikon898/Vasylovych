package com.class11;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String passActual = "12345678";
		boolean a;
		do {
			a = true;
			System.out.println("Enter your LOGIN");
			String log = scan.nextLine();
			System.out.println("Enter your PASSWORD");
			String pass = scan.nextLine();

			if (log.isEmpty() || pass.isEmpty()) {
				System.out.println("Fields cannot be empty");
				a = false;

			} else if (pass.length() < 8) {
				System.out.println("Pass is too short");
				a = false;

			} else if (pass.equalsIgnoreCase(log)) {
				System.out.println("Fields cannot be Same");
				a = false;

			} else if (pass != passActual) {
				System.out.println("Pass does not match");
				a = false;

			}
			System.out.println("________________________");
			
		} while (a == false);

		System.out.println("Username and password created");

	}

}
