package com.deltasac.simple.samplesuite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.deltasac.simple.tests.BaseTest;
import com.deltasac.simple.tests.TestConstants;
import com.deltasac.simple.tests.buiders.SearchTestBuilder;
import com.deltasac.simple.tests.model.Search;
import com.deltasac.simple.tests.pages.GoogleResultsPage;
import com.deltasac.simple.tests.pages.GoogleSearchPOMPage;

public class SampleBestPracticesTest extends BaseTest {

	private Search search;
	private GoogleSearchPOMPage searchPage;
	private GoogleResultsPage resultsPage;
	
	@Before
	public void setUp() throws Exception {
		searchPage = new GoogleSearchPOMPage(getDriver());
		resultsPage =  new GoogleResultsPage(getDriver());
		search = new SearchTestBuilder().basicSearch().build();		
	}

	@Test
	public void test() {
		searchPage.visit();
		searchPage.buscar(search.getQuery());
		resultsPage.waitForPageLoad(TestConstants.DEFAULT_TIMEOUT);
	
		assertTrue(resultsPage.getTitle().contains(search.getQuery()));
	}

}

