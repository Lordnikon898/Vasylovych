package com.class15;

public class aaa {

	 String ff(String a, char b) {
		   String c = a.replace(b, '*');
		  return c;
		  }
public static void main(String s[]) {

		aaa a = new aaa();

		// a.bothEven(2,3);
		// System.out.println(a.sp("hello"));
		// System.out.println(a.sp("technology"));
		System.out.println(a.ff("computer science", 'e'));
		System.out.println(a.ff("trick or treat", 't'));

	}

}
