package com.pageObjectModel;


import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AdactinLoginPage extends BaseClass {
	
	//page object model------> store the all elements
	@FindBy(id="username ")
	private WebElement username;
    @FindBy(id="password")
	private WebElement password;
	@FindBy(name="login")
	private WebElement loginButton;
	public AdactinLoginPage() {//constructor why because same classname and methodname
	PageFactory.initElements(driver, this);
	
	}
	public void LoginPage() {
		inputvalues(username,"gunamahesh");
		inputvalues(password,"Fu4@iVbuJmTkB9");
		clickElement(loginButton);
		
		
	}

		
	
	private void clickElement(WebElement loginButton2) {
		
		
	}
	private void inputvalues(WebElement username2, String string) {
		
		
	}
	
}
