package com.testing;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class CrossBrowserTesting extends BaseClass {
	@Test
	
private void chrome() {
		launchBrowser("chrome");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID : " +Thread.currentThread().getId());
		terminateBrowser();
	}
	
	@Test
	private void edge() {
		launchBrowser("edge");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID: " +Thread.currentThread().getId());
	}
	
	

}
