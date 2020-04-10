package com.class21;

public abstract class Marks {

	abstract void getPercentage();

	public static void main(String s[]) {
		A studentA = new A(2, 3, 4);
		B studentB = new B(5, 3, 2, 5);
		studentA.getPercentage();
		studentB.getPercentage();
	}
}
