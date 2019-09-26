package com.deltasac.simple.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPOMPage extends BasePage{

	private By searchInputLocator = By.name("q");
	private By searchFormLocator = By.id("tsf");
	
	public GoogleSearchPOMPage(WebDriver driver) {
		super(driver);
	}
	
	public void visit() {
		visit("https://www.google.com.pe/");
	}
	
	public void buscar(String query) {
		type(query,searchInputLocator);
		submit(searchFormLocator);		
	}

}
