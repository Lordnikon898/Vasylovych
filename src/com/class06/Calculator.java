package com.class06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Using scanner class create calculator. Allow user to enter 2 numbers 
		//and
		// operator(+,-,*,/). Based on operator provide the result to user.
		double a,b,c;
		char v;
		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a");
		 a = scan.nextDouble();
		 
		 System.out.println("Enter b");
		 b = scan.nextDouble();
		 
		 System.out.println("What do we do with these, type +, - , / ,*  ");
		 v = scan.next().charAt(0);
		
		switch (v){
			case '+' :
				c=a+b;
				System.out.println("a+b = "+c);
				break;
			case '-':
				c=a-b;
				System.out.println("a+b = "+c);

				break;
			case '/':
				c=a/b;
				System.out.println("a/b = "+c);

				break;
			case '*' :
				c=a*b;
				System.out.println("a*b = "+c);

				break;

				default:
					System.out.println("wrong sign");
					break;
		}
		

	}

}
