package com.class14;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog nanc = new Dog();
        nanc.age = 2;
        nanc.breed = "labrador";
        nanc.color = "brown";
        nanc.name = "nance";
        
        Dog bay = new Dog();
        bay.age = 1;
        bay.breed = "Shiba inu";
        bay.name ="Bay";
        bay.color = "tan";
        
        bay.bark();

	}

}
