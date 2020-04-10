package com.class21;

public class A extends Marks {
	int a;
	int b;
	int c;

	A(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	void getPercentage() {
		System.out.println("Avarege mark is = " + ((a + b + c) / 3));

	}

}

class B extends Marks {
	int a;
	int b;
	int c;
	int d;

	B(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	void getPercentage() {
		System.out.println("Avarege mark is = " + ((a + b + c + d) / 4));

	}

}
