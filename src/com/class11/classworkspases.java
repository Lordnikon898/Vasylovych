package com.class11;

public class classworkspases {

	public static void main(String[] args) {
		String s1 = "How are we doing today";
		s1 = s1.replace(" ", "");
		System.out.println(s1);

		String s2 = "Lodasj w23*$$#45";
		int num = s2.length();
		s2 = s2.replaceAll("[^A-Za-z0-9]", "");
		num = num - s2.length();

		System.out.println(num);

		String a = "Is it saturday? Is it raining? Do we have a java class today?";
		String []b = a.split("[$^$#@/?]");
		
		for(String t:b) {
			System.out.println(t);
		}

	}

}
