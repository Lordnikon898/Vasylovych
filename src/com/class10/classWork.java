package com.class10;

import java.util.Random;

public class classWork {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it. Using 2 different
		// loops print all elements from the array.

//Create an array on integers and calculate the sum of 
//		all integer elements in an array.

//Create an array of countries. While retrieving 
		// all values from an array print capital for each country.
		// (use 2 different loops).
		String arr1[] = { "elephant", "tiger", "cat", "fox", "dog", "shark" };
		for (String pet : arr1) {
			System.out.println(pet);
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		Random r = new Random();
		int sum = 0;

		int arr2[] = new int[4];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = r.nextInt();
		}
		
		for (int j : arr2) {
			sum = sum + j;
		}
		
		System.out.println("sum is " + sum);
		String []con= {"Ukraine","Russia","USA"};
		
		for(String c:con) {
			System.out.println(c);
			if(c.equals("Ukraine")) {
				System.out.println("Kiev");
			}
			else if(c.equals("Russia")) {
				System.out.println("Moskva");
			}
			else if(c.equals("USA")) {
				System.out.println("Washington D.C.");
			}
			
		}
		int lar=0;
		int arrr[]= {123,555,-1,23,337,11};
		for(int y=0;y<arrr.length;y++) {
			if(arrr[y]>lar) {
				lar=arrr[y];
			}
		}
		System.out.println(lar);

		String month[][]= {{"December", "January", "February"},
				           {"March",    "April",   "May"},
				           {"June",     "July",    "August","wewew"},
				           {"September","November","October"}};
		System.out.println(month[2].length);
	}
	

}
