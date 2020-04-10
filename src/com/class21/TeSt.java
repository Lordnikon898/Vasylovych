package com.class21;

public class TeSt {

	public static void main(String[] args) {
		Shape ss[] = {new Circle(2), new Square(2,5)};
		for(Shape s:ss) {
			s.calculateArea();
			s.calculatePerimiter();
		}
	}

}
