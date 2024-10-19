package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AdactinSearchHotelPage extends BaseClass {
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	
	public AdactinSearchHotelPage() {
		PageFactory.initElements(driver, this);
		}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	} 
	
	
	
	
	
	
	 
	

}
