package com.deltasac.simple.samplesuite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deltasac.simple.tests.BaseTest;
import com.deltasac.simple.tests.pages.GoogleSearchPOMPage;

public class SampleBaseTest extends BaseTest {

	private GoogleSearchPOMPage searchPage;

	@Before
	public void setUp() throws Exception {
		searchPage = new GoogleSearchPOMPage(getDriver());
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}

	@Test
	public void test() {
		searchPage.visit();
		searchPage.buscar("Delta Informatica");

		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		wait.until(ExpectedConditions.titleContains("Delta"));

		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement resultStats = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("resultStats"));
			}

		});*/
			 

		assertTrue(getDriver().getTitle().contains("Delta"));
	}

}
