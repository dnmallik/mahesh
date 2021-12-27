package com.vam.search.service;

/**
* CustomerService is a service class with @Service annotation
* to call the CustomerRepository getCustomerDetails() method by passing the input parameters 
*
* @author  Divakar Medchalam
* @version 1.0
* @since   2020-07-10 
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.search.domain.Customer;
import com.vam.search.repository.CustomerRepository;

@Service
public class CustomerService {

@Autowired	
CustomerRepository customerRepository;


public List<Customer> customerSearch(Customer customer){
	
	/*
	 * CustomerSearch(Customer customer) method takes the customer object as input parameter 
	 * which contains the Customer Search input request fields. 
	 * This method calls the CustomerRepository.getCustomerDetails() 
	 * to get the customer details from the database */
	
	if (customer.getQuote_no() != null) {
		return customerRepository.getCustomerDetails(customer.getUser_id(), customer.getFirstname(), customer.getLastname(),customer.getMobile_no(),customer.getEmail_id(), 
				customer.getLob_name(), customer.getProduct_name(), customer.getCustomer_id(), customer.getQuote_no(),customer.getPage(),customer.getLimit());
		
	}
	else if(customer.getPolicy_no()!= null) {
		
		return customerRepository.getCustomerDetails(customer.getUser_id(), customer.getFirstname(), customer.getLastname(),customer.getMobile_no(),customer.getEmail_id(),
				customer.getLob_name(), customer.getProduct_name(), customer.getCustomer_id(), customer.getPolicy_no(),customer.getPage(),customer.getLimit());
	
	}else if(customer.getProposal_no()!= null){
		
		return customerRepository.getCustomerDetails(customer.getUser_id(), customer.getFirstname(), customer.getLastname(),customer.getMobile_no(),customer.getEmail_id(),
				customer.getLob_name(), customer.getProduct_name(), customer.getCustomer_id(), customer.getProposal_no(),customer.getPage(),customer.getLimit());
	
	}else {
		
		return customerRepository.getCustomerDetails(customer.getUser_id(), customer.getFirstname(), customer.getLastname(),customer.getMobile_no(),customer.getEmail_id(),
				customer.getLob_name(), customer.getProduct_name(), customer.getCustomer_id(), null,customer.getPage(),customer.getLimit());
	}
	 
	
}
	

}
