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

import com.vam.search.domain.Proposal;
import com.vam.search.repository.ProposalRepository;

class ProposalServiceTest {

	@InjectMocks
	ProposalService proposalService;
	
	@Mock
	ProposalRepository proposalRepository ;
	
		
	@BeforeEach
	void setup() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void proposalSearchTest() {
		Proposal proposal = new Proposal();
		proposal.setUser_id(2001);
		proposal.setCustomer_id(1234);
		proposal.setFirstname("firstname");
		proposal.setLastname("lastname");
		proposal.setPage(0);
		proposal.setLimit(3);
		
		List<Proposal> lq = new ArrayList<Proposal>();
		lq.add(proposal);
	
		when(proposalRepository.getProposalDetails(proposal.getUser_id(),proposal.getFirstname(), proposal.getLastname(), null, null, proposal.getCustomer_id(), null,proposal.getPage(),proposal.getLimit())).thenReturn(lq);
	
		
		List<Proposal> proposalResult = new ArrayList<Proposal>();
		proposalResult = proposalService.proposalSearch(proposal);
		
		assertNotNull(lq);
		assertEquals("firstname", proposalResult.get(0).getFirstname());
	
	}
}
