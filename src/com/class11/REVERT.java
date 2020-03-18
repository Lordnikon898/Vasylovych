package com.class11;

public class REVERT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "LOLO";
		String reverse = "";
		
		
		for(int i=str.length()-1; i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.print(reverse);

	}

}
