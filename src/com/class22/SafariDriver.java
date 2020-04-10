package com.class22;

public class SafariDriver implements RemoteWebDriver{

	@Override
	public void getScreenshot() {
		System.out.println("Sfari takes screenshot");
		
	}

	@Override
	public void open() {
		System.out.println("Sfari opened");
		
	}

	@Override
	public void close() {
		System.out.println("Sfari closed");
		
	}

	@Override
	public String getTitle() {
		System.out.println("safari title?");
		return "safari";
	}

	@Override
	public void navigate() {
		System.out.println("Sfari navigate");
		
	}

}
