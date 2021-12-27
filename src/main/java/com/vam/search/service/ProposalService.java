package com.vam.search.service;

/**
* ProposalService is a service class with @Service annotation
* to call the ProposalRepository getProposalDetails() method by passing the input parameters 
*
* @author  Sravan Kumar Kuruma
* @version 1.0
* @since   2020-07-10 
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.search.domain.Proposal;
import com.vam.search.repository.ProposalRepository;

@Service
public class ProposalService {

	@Autowired
	ProposalRepository proposalRepository;
	
	public List<Proposal> proposalSearch(Proposal proposal) {
		/*
		 * ProposalSearch(Proposal proposal) method takes the proposal object as input parameter 
		 * which contains the Proposal Search input request fields. 
		 * This method calls the ProposalRepository.getProposalDetails() 
		 * to get the proposal details from the database */
		
		return proposalRepository.getProposalDetails(proposal.getUser_id(),proposal.getFirstname(),proposal.getLastname(),proposal.getLob_name(),proposal.getProduct_name(),proposal.getCustomer_id(),proposal.getProposal_no(),proposal.getPage(),proposal.getLimit());
	}

}

