package com.class05;

import java.util.Scanner;

public class Whatday  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What day is today");
		String day = in.next();
		if (day.equals("Monday")
				|| day.equals("Tuesday")
				|| day.equals("Wednesday")
				|| day.equals("Thursday")
				|| day.equals("Friday")) {
			System.out.print("Its weekday");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.print("Its weekend");
		} else {
			System.out.print("Wrong input");
		}

	}

}
