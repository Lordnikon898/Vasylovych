package com.class20;

public class Apple extends Computer {
	void powerOn() {
		System.out.println("Apple is loading");
	}

	void apple() {
		System.out.println("Apple");
	}

	Apple() {
		this.price = 999;
	}
}

class Dell extends Computer {
	Dell() {
		this.price = 500;
	}

	void powerOn() {
		System.out.println("Dell is loading");
	}

	void dell() {
		System.out.println("Dell");
	}
}

class HP extends Computer {
	void powerOn() {
		System.out.println("HP is loading");
	}

	HP() {
		this.price = 459;
	}

	void hp() {
		System.out.println("HP");
	}
}

class Lenovo extends Computer {
	void powerOn() {
		System.out.println("Lenovo is loading");
	}

	void lenovo() {
		System.out.println("Lenovo");
	}

	@Override
	void powerOff() {
		// TODO Auto-generated method stub
		super.powerOff();
	}

	Lenovo() {
		this.price = 299;
	}
}
