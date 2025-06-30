package com.iyzico.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.iyzico.testbase.BaseClass;
import com.iyzico.testbase.PageInitializer;

public class CommonMethods extends PageInitializer{
	
	
	public static void sendText(WebElement element, String text) 
	{
		element.clear();
		element.sendKeys(text);
	}
	
	public static void click(WebElement element)
	{
		waitForClickability(element, driver);
		element.click();
	}
	
	public static WebElement waitForClickability(WebElement element,WebDriver driver) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement waitForVisibility(WebElement element,WebDriver driver) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
	
	public static void ScrollDown(WebDriver driver,WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250);");
		
	}
	
	  public void selectRandomRadioButton(WebDriver driver) {
	        
	        Random random = new Random();
	        

	        int randomIndex = random.nextInt(pconfirmPage.cardOptions.size());

	        
	        WebElement selectedRadioButton = pconfirmPage.cardOptions.get(randomIndex);
	        selectedRadioButton.click();
	    }
	public static void wait(int seconds)
	{
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static String getTimestamp()
	
	{
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		
		return sdf.format(date);
		
	}
		
	
	public static byte[] takeScreenshot(String fileName)
	
	{
		
		String destination = Constants.SCREENSHOT_FILEPATH + fileName + getTimestamp() + ".png";
		
		TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
		
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenShot, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
		
		return screenshotBytes;
	}
	
	
	
}


