package com.deltasac.simple.tests.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static final WebDriver getDriver(DriverType type) {
		switch(type) {
		case CHROME:
			return getChromeDriver();
		case CHROME_HEADLESS:
			return getChromeHeadlessDriver();
		case FIREFOX:
			return getFirefoxDriver();
		}
		return null;
	}
	
	private static WebDriver getFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/firefox/geckodriver.exe");
		return new FirefoxDriver();   
	}

	private static WebDriver getChromeHeadlessDriver() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		return new ChromeDriver(options);
	}

	private static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		return new ChromeDriver();		
	}
}
