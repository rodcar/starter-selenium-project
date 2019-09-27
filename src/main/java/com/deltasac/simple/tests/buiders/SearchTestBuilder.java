package com.deltasac.simple.tests.buiders;

import com.deltasac.simple.tests.model.Search;

public class SearchTestBuilder {

	private Search search;

	public SearchTestBuilder() {
		this.search = new Search();
	}
	
	public Search build() {
		return this.search;
	}
	
	public SearchTestBuilder withQuery(String query) {
		this.search.setQuery(query);
		return this;
	}
	
	public SearchTestBuilder basicSearch() {
		this.search.setQuery("Delta Informatica");
		return this;		
	}

}
