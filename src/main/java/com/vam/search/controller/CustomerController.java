package com.vam.search.controller;

/**
* The Customer Search implements an application that
* displays Customer Details to the standard output based on the user id and role of the user.
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

import com.vam.search.domain.Customer;
import com.vam.search.service.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
public class CustomerController{

@Autowired	
CustomerService customerService;

@PostMapping("/searchCustomer")
@ResponseBody
public List<Customer> getCustomerInfo(@RequestBody Customer customer) {
	
	return customerService.customerSearch(customer);

}	
}
