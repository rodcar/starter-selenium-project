package com.deltasac.simple.samplesuite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deltasac.simple.tests.BaseTest;
import com.deltasac.simple.tests.buiders.SearchTestBuilder;
import com.deltasac.simple.tests.model.Search;
import com.deltasac.simple.tests.pages.GoogleSearchPOMPage;

public class SampleDataTest extends BaseTest {

	private Search search;
	private GoogleSearchPOMPage searchPage;
	

	@Before
	public void setUp() throws Exception {
		searchPage = new GoogleSearchPOMPage(getDriver());
		search = new SearchTestBuilder().basicSearch().build();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		searchPage.visit();
		searchPage.buscar(search.getQuery());

		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		wait.until(ExpectedConditions.titleContains(search.getQuery()));
	
		assertTrue(getDriver().getTitle().contains(search.getQuery()));
	}

}
