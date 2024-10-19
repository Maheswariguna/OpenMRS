package com.runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pageObjectModel.AdactinSearchHotelPage;

public class TestRunner extends BaseClass {
	public static void main(String[] args) {
		
	
		
		
		launchBrowser("chrome");
		launchUrl("https://google.com/");

		AdactinSearchHotelPage a = new AdactinSearchHotelPage();
		passinput(a.getHotels(), "rose");
		navigatepage("https://letcode.in/dropdowns");

		
		
		
        	
	
		
		
		
		
	}

	
	
		
	}
	
	
	
	
	
	


