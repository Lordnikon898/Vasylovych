package com.class19;

public class Circle extends Shape{
	Circle(double radius){
		super.radius = radius;
	}
	void met(){
		System.out.println(radius*3.14*2);
	}
	public static void main(String[]a) {
		Circle f = new Circle(23);
		f.met();
	}

}
