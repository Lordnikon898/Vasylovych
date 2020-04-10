package com.class20;

public class AX extends CreditCard {
	AX(double a, double b){
		super(a,b);
	}
	void calc() {
		System.out.println("oveerrAx" + balance * interest);

	}
}
