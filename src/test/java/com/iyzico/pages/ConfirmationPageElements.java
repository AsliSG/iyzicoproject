package com.iyzico.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iyzico.testbase.BaseClass;

public class ConfirmationPageElements {
	
	@FindBy(xpath="//h1[text()='Sipariş alındı']")
	public WebElement confirmationText;
	
	
	
	public ConfirmationPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	


	
	

}
