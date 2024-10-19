package com.pageObjectManager;



import java.io.FileReader;
 
import com.pageObjectModel.AdactinLoginPage;
import com.pageObjectModel.AdactinSearchHotelPage;

public class PageObjectManager {
	
	private FileReader fileReader;
	
	private AdactinLoginPage login;
	
	private AdactinSearchHotelPage searchHotel;
	
	public FileReader getFileReader(){
		//fileReader = new fileReader();
		if(fileReader==null) {
			
		}
		return fileReader;
		
		}
	
	public AdactinLoginPage getAdactinLoginPage() {
		
		if(login==null) {
			login = new AdactinLoginPage();
			}
		return login;
		}
	public AdactinSearchHotelPage getAdactinSearchHotelPage() {
		
		if(searchHotel==null) {
			searchHotel = new AdactinSearchHotelPage();
			
		}
		return searchHotel;
		
	}
	
	
	
	
	
	
	
	
	

}

