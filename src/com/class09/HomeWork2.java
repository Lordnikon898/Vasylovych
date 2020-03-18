package com.class09;

public class HomeWork2 {

	public static void main(String[] args) {
//		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		// Then print a
//		// grade B (use 2 different ways of creating an array).
//
////Create an array of names and store all names of your group. 
//		Then print your name from that array. 
//		(use 2 different ways of creating an array).
////
////
////Create an array of words: Java, Saturday, day, coding, is. 
//		Print the following sentence using elements of array:
//			“Saturday is Java coding Day”.
		char []arr = {'A','B','C','D','F','E'};
		System.out.println(arr[1]);
		
		String group[];
		group= new String[3];
		group[0]="Mike";
		group[1]="Oksana";
		group[2]="Borys";
		System.out.println(group[2]);
		
		
		String n[]= {" Java "," Saturday "," day "," coding "," is "};
		System.out.println(n[1]+n[4]+n[0]+n[3]+n[2]);
		
	}

}
