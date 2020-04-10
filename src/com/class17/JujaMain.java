package com.class17;

public class JujaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juja borys = new Juja("Borys", 5,4,5); 
		Juja andrew = new Juja("Andrew", 3,4,5); 
		Juja max = new Juja("Max", 3,2,5);
		Juja juli = new Juja("Juli", 5,4,5);
		Juja lola = new Juja("Lola", 3,5,5);
		
		System.out.println(juli.mark());
		System.out.println(andrew.mark());
		System.out.println(borys.mark());
		System.out.println(lola.mark());
		System.out.println(max.mark());
	}

}
