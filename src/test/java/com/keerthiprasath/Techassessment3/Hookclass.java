package com.keerthiprasath.Techassessment3;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookclass {
	@Before
	public static void setUp() {
		Helperclass.setUpDriver();
	}
	
	@After
	public static void  tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[]screenshot = ( (TakesScreenshot)  Helperclass.getDriver()).getScreenshotAs(OutputType.BYTES); 
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		}
}
