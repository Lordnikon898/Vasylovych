package com.class14;

public class Phone {
    int storage;
    String make, os;
    void power() {
    	System.out.println(make +" is turnin on");
    }
    void call()
    {
    	System.out.println(make +" is callin");
    }

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.storage= 16;
		phone.make="Iphone 4";
		phone.os= "IOS";
		phone.call();
		
		Phone phone1 = new Phone();
		phone1.storage= 32;
		phone1.make="Samsung galaxy 4";
		phone1.os= "Android";
		phone1.power();
		
		Phone phone2 = new Phone();
		phone2.storage= 0;
		phone2.make="Nokia 3301";
		phone2.os= "Symbian";
		phone2.power();
		
		

	}
	

}
