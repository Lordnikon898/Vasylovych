package com.class22;

public class ChromeDrive implements RemoteWebDriver {

	@Override

	public void getScreenshot() {
		System.out.println("chrome takes screenshot");

	}

	@Override
	public void open() {
		System.out.println("chrome opened");

	}

	@Override
	public void close() {
		System.out.println("chrome closed");

	}

	@Override
	public String getTitle() {
		System.out.println("chrome title?");
		return "chrome";
	}

	@Override
	public void navigate() {
		System.out.println("chrome navigate");

	}

}
