package com.class21;

public abstract class Car {
	String color;
	int price;

	abstract void calcPrice();
	public static void main(String h[]) {
	  Car []cars = {new Sedan(22),new Truck(1999)};
	  for(Car car:cars ) {
		  car.calcPrice();
	  }
	}

}

class Sedan extends Car {
	int lenght;

	public Sedan(int lenght) {
		super();
		this.lenght = lenght;
	}

	@Override
	void calcPrice() {
		if (lenght > 20) {
			System.out.println("Discount 5%");
		} else {
			System.out.println("Discount 10%");

		}

	}

}

class Truck extends Car {
	int weight;

	public Truck(int weight) {
		super();
		this.weight = weight;
	}

	@Override
	void calcPrice() {
		if (weight > 2000) {
			System.out.println("Discount 10%");
		} else {
			System.out.println("Discount 20%");

		}

	}

}
