package com.deltasac.simple.samplesuite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deltasac.simple.tests.driver.DriverFactory;
import com.deltasac.simple.tests.driver.DriverType;
import com.deltasac.simple.tests.pages.GoogleSearchPOMPage;
//import com.deltasac.simple.tests.pages.GoogleSearchPage;

public class SampleDriverFactoryTest {
	
	private WebDriver driver;
	private GoogleSearchPOMPage searchPage;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverType.FIREFOX);
		searchPage = new GoogleSearchPOMPage(driver);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();		
	}

	@Test
	public void test() {
		searchPage.visit();
		searchPage.buscar("Delta Informatica");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains("Delta"));
		
		assertTrue(driver.getTitle().contains("Delta"));
	}

}
