package com.iyzico.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iyzico.testbase.BaseClass;

public class SecurePageElements {
	
	@FindBy(xpath="//input[@id='smsCode']")
	public WebElement textbox;

	@FindBy(xpath="//button[@id='submitBtn']")
	public WebElement submitButton;
	
	
	public SecurePageElements() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
