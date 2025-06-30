package com.iyzico.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iyzico.testbase.BaseClass;

public class PaymentPageElements {

	
	@FindBy(xpath ="//h1[text()='Ödeme']")
	public WebElement paymentText;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	public WebElement debitcreditcardRadioButton;
	

	@FindBy(xpath="//div[@class='payment_box payment_method_iyzico']")
	public WebElement bankcredittext;
	
	@FindBy(id="place_order")
	public WebElement payButton;
	
 public PaymentPageElements() 
 {
	 PageFactory.initElements(BaseClass.driver, this);
 }
	
	
}
