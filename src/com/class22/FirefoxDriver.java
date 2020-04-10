package com.class22;

public class FirefoxDriver implements RemoteWebDriver {

	@Override
	public void getScreenshot() {
		System.out.println("firefox takes screenshot");
		
	}

	@Override
	public void open() {
		System.out.println("firefox opened");
		
	}

	@Override
	public void close() {
		System.out.println("firefox closed");
		
	}

	@Override
	public String getTitle() {
		System.out.println("firefox title?");
		return "firefox";
	}

	@Override
	public void navigate() {
		System.out.println("firefox navigate");
		
	}

}
