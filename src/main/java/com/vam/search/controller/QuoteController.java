package com.vam.search.controller;

/**
* The Quote Search implements an application that
* displays Quote Details to the standard output based on the user id and role of the user.
*
* @author  Divakar Medchalam
* @version 1.0
* @since   2020-07-10 
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.vam.search.domain.Quote;
import com.vam.search.service.QuoteService;

@CrossOrigin(origins = "*")
@RestController
public class QuoteController {
	
	@Autowired
	QuoteService quoteService;
	
	@PostMapping("/searchQuote")
	@ResponseBody
	public List<Quote> getQuoteInfo(@RequestBody Quote quote) {
		
		
		return quoteService.quoteSearch(quote);
	}
	
}
