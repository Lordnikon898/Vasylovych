package com.class21;

public class Circle implements Shape{
	double r;
	
	Circle(double r){
		this.r =r;
	}

	@Override
	public void calculateArea() {
	System.out.println("Area is ="+(3.14*r*r));		
	}

	@Override
	public void calculatePerimiter() {
		System.out.println("Perimiter is ="+(2*3.14*r));
		
	}

	

}
