package com.class17;

class Juja {

	String name;

	int a;
	int b;
	int c;

	Juja(String name, int a, int b, int c){
		this.name = name;
		this.a=a;
		this.b=b;
		this.c=c;	
	}

	double mark() {
		double a=this.a;
		double b=this.b;
		double c=this.c;
		double mark = (a + b + c) / 3;
		return mark;
	}

//	Juja(int a, int b) {
//		System.out.println(a + " " + b);
//	}
//
//	Juja() {
//		System.out.println("nothing to see here");
//	}

}