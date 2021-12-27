package com.vam.search.repository;

/**
* CustomerRepository interface is a repository to connect to the DB 
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

import com.vam.search.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

	/* This method calls the getCustomerDetails() 
	 * stored procedure with input parameters whose return type is of 
	 * List<Customer>. */
	
	@Query(nativeQuery = true, value = "call get_customerDetails(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11)")
	public List<Customer> getCustomerDetails(Integer user_id, String firstname, String lastname,String mobile_no,String email_id, String lob_name,
			String product_name, Integer customer_id, Integer quote_policy_proposal_no,int page,int limit);
	

}
