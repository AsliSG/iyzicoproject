package com.iyzico.steps;

import com.iyzico.testbase.BaseClass;

import com.iyzico.utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void start()
	{
		BaseClass.setUp();
	}
	
	@After
	public void end(Scenario scenario)
	{
		byte[] screenshot; 
		
		if (scenario.isFailed())
		{
			
			screenshot = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		}
		else 
		{
			
			screenshot = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}
		
		scenario.attach(screenshot, "image/png", scenario.getName());
		
		BaseClass.tearDown();
	}

	
	
}

