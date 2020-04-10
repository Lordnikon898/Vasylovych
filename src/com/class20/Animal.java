package com.class20;

public class Animal {
	void eat(){}
}

class Cat extends Animal {
	String aa;

	void eat() {
		System.out.println("Cat eats");
	}

}

class K1 extends Cat {
	K1(String aa) {
		this.aa = aa;
	}

	void eat() {
		System.out.println("kitten1 eats " + aa);
	}
}

class K2 extends Cat {
	K2(String aa) {
		this.aa = aa;
	}

	void eat() {
		System.out.println("kitten2 eats " + aa);
	}
}

class K3 extends Cat {
	K3(String aa) {
		this.aa = aa;
	}

	void eat() {
		System.out.println("kitten3 eats " + aa);
	}
}
