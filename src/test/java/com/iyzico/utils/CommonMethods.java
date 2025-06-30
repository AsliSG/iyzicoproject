package com.iyzico.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;

import com.iyzico.testbase.BaseClass;
import com.iyzico.testbase.PageInitializer;

public class CommonMethods extends PageInitializer{
	
	
	public static void sendText(WebElement element, String text) 
	{
		element.clear();
		element.sendKeys(text);
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


