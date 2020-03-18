package com.class06;

import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		// Ask user to enter their country and capture it. Once values are captured
		// print which language user speaks.

		// Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		// C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		// should print which grade was entered by a user with explanation.
		System.out.println("Enter name of country");
		String coun = scan.next();
		
		switch (coun.toLowerCase()){
			case "ukraine":
				System.out.println("These guys speak ukrainian");
				break;
			case "russia":
				System.out.println("These guys speak russian");
				break;
			case "moldova":
				System.out.println("These guys speak romanian");
				break;
				default:
					System.out.println("invalid");
					break;
		}
		}
	
		
	
		
		

	}


