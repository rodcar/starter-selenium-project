package com.deltasac.simple.tests;

import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;

import com.deltasac.simple.tests.driver.DriverFactory;
import com.deltasac.simple.tests.driver.DriverType;


public class BaseTest {
	
	private WebDriver driver;

	@Rule
	public ExternalResource resource = new ExternalResource() {

		@Override
		protected void before() {
			driver = DriverFactory.getDriver(DriverType.CHROME);
			driver.manage().window().maximize();
		}

		@Override
		protected void after() {
			//driver.quit();
		}
	};

	public WebDriver getDriver() {
		return driver;
	}
}
