package com.Maven_Project;

	import org.openqa.selenium.By;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import org.testng.internal.BaseClassFinder;

import com.base.BaseClass;

	public class DataProviderTest extends BaseClass {
		@Test(dataProvider = "login")

		private void login() {
			launchBrowser("chrome");
			launchUrl("https://opensource-demo.orangehrmlive.com");
			driver.findElement(By.name("username")).sendKeys();
			driver.findElement(By.name("password")).sendKeys();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
		@DataProvider(name = "login")
			
	public Object [][] setdata(){
		return new Object[][]
				{{"Admin","admin123"},{"abc","123"},{"efg","456"},{"hij","789"}};
				
				
				
		
				}
		}

		




