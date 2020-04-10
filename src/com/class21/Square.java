package com.class21;

public class Square implements Shape {
	double a, b;

	Square(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area is =" + (a * b));

	}

	@Override
	public void calculatePerimiter() {
		System.out.println("Periment is =" + a + a + b + b);

	}

}
