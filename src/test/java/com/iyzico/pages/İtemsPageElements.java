package com.iyzico.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iyzico.testbase.BaseClass;

public class İtemsPageElements {
	
	@FindBy (xpath="// button[text()='Sepete Ekle']")
	public WebElement clickToAddChartButton;
	
	@FindBy(linkText="Sepeti görüntüle")
	public WebElement viewChartButton;
	
	
	
	
	public İtemsPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	


}
