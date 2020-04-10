package com.class18;

public class Book {

	int xx;

	Book() {
		this(3);
		System.out.println("No param");

	}

	Book(int x) {
		
		xx = x;
		System.out.println("1 param");

	}

	public static void main(String g[]) {
		Book b = new Book();
		System.out.println("Instance variable is "+b.xx);

	}

}
