package com.iyzico.steps;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.iyzico.testbase.BaseClass;
import com.iyzico.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SuccessfulOrderCompletionSteps extends CommonMethods {
	
	@When("the user clicks on the second item on the page and adds it to the basket")
	public void the_user_clicks_on_the_second_item_on_the_page_and_adds_it_to_the_basket() {
	    click(mainPage.shoeitem);
	    wait(2);
	    click(itemsPage.clickToAddChartButton);
	}
	@When("clicks on to show basket button")
	public void clicks_on_to_show_basket_button() {
	 click(itemsPage.viewChartButton);
	 wait(2);
	}
	@When("clicks to go to payment page")
	public void clicks_to_go_to_payment_page() {
	    click(chartPage.goToPaymentButton);
	    waitForVisibility(paymentPage.paymentText, BaseClass.driver);
	    
	    
	}
	@When("chooses debit\\/credit card option and clicks pay with credit\\/debit card button")
	public void chooses_debit_credit_card_option_and_clicks_pay_with_credit_debit_card_button() {
		wait(2);
		scrollToElement(driver,paymentPage.bankcredittext);
		if (paymentPage.debitcreditcardRadioButton.isDisplayed()&&paymentPage.debitcreditcardRadioButton.isEnabled()) 
		{
			paymentPage.debitcreditcardRadioButton.click();
		}
	
		wait(2);
		click(paymentPage.payButton);
		
	}
	@When("select one of the entered credit card option and click to fast pay")
	public void select_one_of_the_entered_credit_card_option_and_click_to_fast_pay() {
		ScrollDown(driver,pconfirmPage.selectvardoptionText);
		wait(4);
		selectRandomRadioButton(driver);
		wait(8);
		click(pconfirmPage.fastpayButton);
	}
	@When("the user enters the SMS code {string}")
	public void the_user_enters_the_sms_code(String code) {
		waitForVisibility(pconfirmPage.codeİnput,driver);
	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript(
		        "arguments[0].value='" + code + "';" +
		        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
		        pconfirmPage.codeİnput
		    );
	    pconfirmPage.codeİnput.sendKeys(Keys.ENTER);
		wait(3);
	    
	}
	@Then("successfully verify {string} text on the system")
	public void successfully_verify_text_on_the_system(String expectedText) {
	      
		waitForVisibility(confirmPage.confirmationText, driver);
		  String actualText=confirmPage.confirmationText.getText();
		  
		  Assert.assertTrue("Confirmation message is not displayed",actualText.equalsIgnoreCase(expectedText));
			    
	}
	
	

}
