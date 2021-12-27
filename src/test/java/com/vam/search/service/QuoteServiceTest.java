package com.vam.search.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.vam.search.domain.Quote;
import com.vam.search.repository.QuoteRepository;
import com.vam.search.service.QuoteService;

class QuoteServiceTest {
	
	@InjectMocks
	QuoteService qs;
	
	@Mock
	QuoteRepository qr;
	
		
	@BeforeEach
	void setup() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void quoteSearchTest() {
		Quote q = new Quote();
		q.setUser_id(2001);
		q.setCustomer_id(1234);
		q.setFirstname("firstname");
		q.setLastname("lastname");
		q.setPage(0);
		q.setLimit(3);
		
		List<Quote> lq = new ArrayList<Quote>();
		lq.add(q);
	
		when(qr.getQuoteDetails(q.getUser_id(),q.getFirstname(), q.getLastname(), null, null, q.getCustomer_id(), null,q.getPage(),q.getLimit())).thenReturn(lq);
	
		
		List<Quote> quoteService = new ArrayList<Quote>();
		quoteService = qs.quoteSearch(q);
		
		assertNotNull(lq);
		assertEquals("firstname", quoteService.get(0).getFirstname());
	
	}

}
