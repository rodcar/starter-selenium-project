package com.deltasac.simple.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	private WebDriver driver; 
	
	private By searchInputLocator = By.name("q");
	private By searchFormLocator = By.id("tsf");
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void visit() {
		driver.get("https://www.google.com.pe/");
	}
	
	public void buscar(String query) {
		driver.findElement(searchInputLocator).sendKeys(query);
		driver.findElement(searchFormLocator).submit();		
	}

}
