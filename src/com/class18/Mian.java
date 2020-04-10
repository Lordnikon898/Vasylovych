package com.class18;

public class Mian {
	
	String name;
	String address;
	
	public Mian(String name, String address){
		this.name = name;
		this.address=address;
	}
	
	void displayInfo() {
		System.out.println(name + " "+ address);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mian ob = new Mian("Borys","Seminary rd");
		ob.displayInfo();

	}

}
