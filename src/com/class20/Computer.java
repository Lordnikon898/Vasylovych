package com.class20;

public class Computer {
	int price;

	void powerOn() {
		System.out.println("Computer is powering on");
	}

	void powerOff() {
		System.out.println("Computer is shuting down");
	}

	public static void main(String[] s) {
		Computer c[] = { new Apple(), new Dell(), new HP(), new Lenovo() };

		for (Computer f : c) {
			f.powerOn();
			f.powerOff();
			System.out.println("Price is " +f.price);

		}

	}
}