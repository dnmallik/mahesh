package com.vam.search.service;

/**
* PolicyService is a service class with @Service annotation
* to call the PolicyRepository getPolicyDetails() method by passing the input parameters 
*
* @author  Sravan Kumar Kuruma
* @version 1.0
* @since   2020-07-10 
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.search.domain.Policy;
import com.vam.search.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired	
	PolicyRepository policyRepository;


	public List<Policy> policySearch(Policy policy){
		
		/*
		 * PolicySearch(Policy policy) method takes the policy object as input parameter 
		 * which contains the Policy Search input request fields. 
		 * This method calls the PolicyRepository.getPolicyDetails() 
		 * to get the policy details from the database */
		
		return policyRepository.getPolicyDetails(policy.getUser_id(), policy.getFirstname(), policy.getLastname(), policy.getLob_name(), policy.getProduct_name(), policy.getCustomer_id(), policy.getPolicy_no(),policy.getPage(),policy.getLimit());
	}
}
