package com.vam.search.repository;

/**
* QuoteRepository interface is a repository to connect to the DB 
* and get results from the MySQL database. 
*
* @author  Divakar Medchalam
* @version 1.0
* @since   2020-07-10 
*/
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vam.search.domain.Quote;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, String> {

	/* This method calls the getQuoteDetails() 
	 * stored procedure with input parameters whose return type is of 
	 * List<Quote>. */ 
	
	  @Query(nativeQuery = true, value = "call get_quoteDetails(?1,?2,?3,?4,?5,?6,?7,?8,?9)")
	  public List<Quote> getQuoteDetails(Integer partnerUserId, String firstname, String lastname, String lob_name, String product_name, Integer customer_id, Integer quote_no,int page,int limit);
}
