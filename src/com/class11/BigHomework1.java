package com.class11;

public class BigHomework1 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings without a temporary variable?
		int x = 1;
		int y = 6;

		y = x + y;
		x = y - x;
		y = y - x;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		String a = "Uno";
		String b = "Dos";
		
        a = a+b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        
		System.out.println(a);
		System.out.println(b);


	}

}
