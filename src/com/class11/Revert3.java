package com.class11;

import java.util.Scanner;

public class Revert3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Moms name");
		String m = scan.next();
		System.out.println("Enter Dads name");
		String d = scan.next();
		System.out.println("Boy or girl?");
		String baby = scan.next();
		String name = "";

		if (baby.equalsIgnoreCase("boy")) {
			name = d.substring(0, (d.length()) / 2).concat(m.substring((d.length()) / 2));

		} else if (baby.equalsIgnoreCase("girl")) {
			name = m.substring(0, (m.length()) / 2).concat(d.substring((m.length()) / 2));
		}
	

		System.out.println(name);

	}

}
