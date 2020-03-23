package com.class15;

public class Mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mark m = new Mark();
		char mark = m.grade(89);
		System.out.println("Your grade is "+mark);

	}

	char grade(int m) {
		char g =0;
		if (m > 90) {
			g = 'A';
		} else if (90 >= m && m > 80) {
			g = 'B';
		} else if (80 >= m && m > 70) {
			g = 'C';
		} else if (70 >= m && m > 60) {
			g = 'D';
		} else if (m < 60) {
			g = 'E';
		}
		return g;

	}

}
