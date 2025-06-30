package com.iyzico.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iyzico.testbase.BaseClass;



public class MainPageElements {

	@FindBy (xpath="//h2[contains(text(),'Serenity Kadın Ayakkabı')]")
	public WebElement shoeitem;
	
	
	
	
	public MainPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
