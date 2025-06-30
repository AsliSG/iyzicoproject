package com.iyzico.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iyzico.testbase.BaseClass;

public class ChartPageElements {
	
	@FindBy(css=".checkout-button.button.alt.wc-forward")
	public WebElement goToPaymentButton;
	
	
	
	
	public ChartPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
