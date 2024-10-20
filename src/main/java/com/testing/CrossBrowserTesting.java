package com.testing;

import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;



public class CrossBrowserTesting extends BaseClassFinder {
	@Test
	
private void chrome() {
		launchBrowser("chrome");
		launchBrowser("https://www.google.co.in/");
		System.out.println("Browser ID : " +Thread.currentThread().getId());
		terminateBrowser();
	}
	
	@Test
	private void edge() {
		launchBrowser("edge");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID: " +Thread.currentThread().getId());
	}

	private void launchBrowser(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
