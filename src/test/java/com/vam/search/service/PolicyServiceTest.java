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

import com.vam.search.domain.Policy;
import com.vam.search.repository.PolicyRepository;

class PolicyServiceTest {

	@InjectMocks
	PolicyService ps;
	
	@Mock
	PolicyRepository pr;
	
		
	@BeforeEach
	void setup() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void policySearchTest() {
		Policy p = new Policy();
		p.setUser_id(2001);
		p.setCustomer_id(1234);
		p.setFirstname("firstname");
		p.setLastname("lastname");
		p.setPage(0);
		p.setLimit(3);
		
		List<Policy> lq = new ArrayList<Policy>();
		lq.add(p);
	
		when(pr.getPolicyDetails(p.getUser_id(),p.getFirstname(), p.getLastname(), null, null, p.getCustomer_id(), null,p.getPage(),p.getLimit())).thenReturn(lq);
	
		
		List<Policy> policyService = new ArrayList<Policy>();
		policyService = ps.policySearch(p);
		
		assertNotNull(lq);
		assertEquals("firstname", policyService.get(0).getFirstname());
	
	}
}
