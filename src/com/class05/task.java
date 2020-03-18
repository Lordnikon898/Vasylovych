package com.class05;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How much sales are");
		double a = scan.nextDouble();
		if (a>1&&a<100) {
			System.out.println("Comission should be 10% which is =  "+a*0.1);
		}
		else if (a>100&&a<200) {
			System.out.println("Comission should be 20% which is =  "+a*0.2);
		}
		else if (a>200&&a<500) {
			System.out.println("Comission should be 30% which is =  "+a*0.3);
		}
		else {
			System.out.println("Comission should be 50% which is =  "+a*0.5);
		}

	}

}
