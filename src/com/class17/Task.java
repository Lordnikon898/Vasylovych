package com.class17;

public class Task {

	int arra(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		return sum;

	}

	public static String rrr(String str) {
		String h = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			h = h + str.charAt(i);
		}
		return h;
	}

	private String vowels(String str) {
		String h = str.replaceAll("[^aeoiuAEIOU]", "");

		return h;
	}

	public static void main(String s[]) {
		Task n = new Task();
		System.out.println(n.vowels("kns3444eewoIQWER"));
	}

}
