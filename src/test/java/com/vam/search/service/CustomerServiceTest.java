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

import com.vam.search.controller.CustomerController;
import com.vam.search.domain.Customer;
import com.vam.search.repository.CustomerRepository;

class CustomerServiceTest {

	@InjectMocks
	CustomerService cs;
	
	@InjectMocks
	CustomerController cc;
	
	@Mock
	CustomerRepository cr;
	
		
	@BeforeEach
	void setup() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void customerSearchTest()  {
		Customer c = new Customer();
		c.setUser_id(2001);
		c.setCustomer_id(1234);
		c.setFirstname("firstname");
		c.setLastname("lastname");
		c.setPage(0);
		c.setLimit(3);
		
		List<Customer> lq = new ArrayList<Customer>();
		lq.add(c);
	
		when(cr.getCustomerDetails(c.getUser_id(),c.getFirstname(), c.getLastname(), null, null,null,null,c.getCustomer_id(), null,c.getPage(),c.getLimit())).thenReturn(lq);
	
		
		List<Customer> customerService = new ArrayList<Customer>();
		customerService = cs.customerSearch(c);
		
		assertNotNull(lq);
		assertEquals("firstname", customerService.get(0).getFirstname());
	
		
		List<Customer> customerServiceCont = new ArrayList<Customer>();
		customerServiceCont = cc.getCustomerInfo(c);
		
		List<Customer> customerController = new ArrayList<Customer>();
		
		assertNotNull(lq);
		assertEquals(customerController.getClass(), customerServiceCont.getClass());
	}
}
