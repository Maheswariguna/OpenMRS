package com.Maven_Project;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class ParameterTest extends BaseClass {
	@Test
	@Parameters({"username","password"})
	
	private void login() {
		launchBrowser("chrome");
		launchUrl("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.name("username")).sendKeys();
		driver.findElement(By.name("password")).sendKeys();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
