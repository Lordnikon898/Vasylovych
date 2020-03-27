package com.class15;

import java.util.Scanner;

public class Homework15 {
	String createEmail(String nama, String last, String email) {
		String fullemail = nama + last + '@' + email;
		return fullemail;
	}

	boolean prime(int a) {
		boolean t = false;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				t = false;
				break;
			} else {
				t = true;
			}
		}

		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a method createEmail(). Based on provided users name,
		// lastName and email type, your method should return complete
		// email Address. Example: johnsnow@gmail.com or
		// johnsnow@yahoo.com*
		// Write a method to return whether given
		// A number is prime or not?
		Scanner scan = new Scanner(System.in);
		
		
		Homework15 a = new Homework15();
		//String full = a.createEmail("Borys", "Vasylovych", "mail.ru");
		//System.out.println(full);
		
		System.out.println("Enter number");
		int x = scan.nextInt();
		
		System.out.println(a.prime(x));
		System.out.print("Whats up fols im typingfrom my brandnew keybord");
		
	}

}
