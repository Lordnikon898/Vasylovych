package com.class06;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		// C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		// should print which grade was entered by a user with explanation.
		System.out.println("Enter grade");
		String coun = scan.next();
		
		switch (coun.toLowerCase()){
			case "a":
				System.out.println(coun+ " is awesome");
				break;
			case "b":
				System.out.println(coun+ " is ok");
				break;
			case "d":
				System.out.println(coun+ " isvery avarage");
				break;
			case "c":
				System.out.println(coun+ " isvery bad");
				break;
			case "f":
				System.out.println("unaccaptable");
				break;

				default:
					System.out.println("invalid");
					break;
		}
		}
	}


