package com.deltasac.simple.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultsPage extends BasePage {
	
	private By estadisticasLocator = By.id("resultStats");

	public GoogleResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public void waitForPageLoad(Integer timeOutInSeconds) { 
		waitForVisibilityOfElement(estadisticasLocator, timeOutInSeconds);
	}

}
