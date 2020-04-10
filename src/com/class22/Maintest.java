package com.class22;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteWebDriver c[] = {new ChromeDrive(), new FirefoxDriver(),new SafariDriver()};
		for (RemoteWebDriver dr: c) {
			dr.open();
			dr.navigate();
			dr.getTitle();
			dr.getScreenshot();
			dr.close();
		}

	}

}
