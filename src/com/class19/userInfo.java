package com.class19;

public class userInfo extends userClass {
	String adress;

	userInfo(String adress,String name, int phone) {
		super(name, phone);
		this.adress = adress;
	}
	void detail(){
		System.out.println(adress+ " " + name+ " " + phone);
	}
	public static void main(String[]s) {
		userInfo n = new userInfo("Adress","Name",1312421);
		n.detail();
	}
	
}
