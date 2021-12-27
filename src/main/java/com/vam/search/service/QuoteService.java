package com.vam.search.service;

/**
* QuoteService is a service class with @Service annotation
* to call the QuoteRepository getQuoteDetails() method by passing the input parameters 
*
* @author  Divakar Medchalam
* @version 1.0
* @since   2020-07-10 
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.search.domain.Quote;
import com.vam.search.repository.QuoteRepository;

@Service
public class QuoteService {

	@Autowired
	QuoteRepository quoteRepository;
	

	public List<Quote> quoteSearch(Quote quote) {

		/*
		 * QuoteSearch(Quote proposal) method takes the quote object as input parameter 
		 * which contains the Quote Search input request fields. 
		 * This method calls the QuoteRepository.getQuoteDetails() 
		 * to get the quote details from the database */
		
		return quoteRepository.getQuoteDetails(quote.getUser_id(),quote.getFirstname(),quote.getLastname(),quote.getLob_name(),quote.getProduct_name(),quote.getCustomer_id(),quote.getQuote_no(),quote.getPage(),quote.getLimit());
	}
}
