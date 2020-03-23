package com.class15;

public class Large {
	void big(int i, int y) {
		if (i > y) {
			System.out.println(i + " = i bigger than y = " + y);
		} else {
			System.out.println(y + " = y bigger than i = " + i);
		}
	}

	void oddeven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " = even  ");

		} else {
			System.out.println(a + " = odd  ");
		}
	}

	void palindrom(String h) {
		String k = "";

		for (int i = h.length() - 1; i >= 0; i--) {
			k = k + h.charAt(i);
		}
		System.out.println(k + " - reversed");
		System.out.println(h + " - normal");

		if (k.equalsIgnoreCase(h)) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}

	}

	void lang(String c) {
		switch (c) {
		case "Russia":
			System.out.println("Privet");
			break;
		case "USA":
			System.out.println("Hello");
			break;
		case "Spain":
			System.out.println("Holla");
			break;

		default:
			System.out.println("sorry no");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Large ob = new Large();
		ob.big(12, 45);
		ob.oddeven(3);
		ob.palindrom("aasaa");
		ob.lang("Spain");

	}

}
