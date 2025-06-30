package com.iyzico.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iyzico.testbase.BaseClass;

public class PaymentConfirmElements {
	
	@FindBy(xpath="//div[@class='css-uvqky4-Check ew4ydag2']")
	public List<WebElement> cardOptions;
	
	@FindBy(xpath="//button[@id='iyzi-proceed-to-quick-pwi']")
	public WebElement fastpayButton;
	
	@FindBy(xpath="//span[contains(text(),'‘ya Kayıtlı Ödeme Yönteminiz Var!')]")
	public WebElement selectvardoptionText;
	
	@FindBy(xpath="//input[@name='verificationCode']")
	public WebElement codeİnput;
	
	
	
	
	public PaymentConfirmElements() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
