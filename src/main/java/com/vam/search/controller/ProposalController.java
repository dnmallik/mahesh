package com.vam.search.controller;

/**
* The Proposal Search implements an application that
* displays Proposal Details to the standard output based on the user id and role of the user.
*
* @author  Sravan Kumar Kuruma
* @version 1.0
* @since   2020-07-10 
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.vam.search.domain.Proposal;
import com.vam.search.service.ProposalService;

@CrossOrigin(origins = "*")
@RestController
public class ProposalController {

	@Autowired
	ProposalService proposalService;
	
	@PostMapping("/searchProposal")
	@ResponseBody
	public List<Proposal> getProposalInfo(@RequestBody Proposal proposal) {
		
		return proposalService.proposalSearch(proposal);
	}
}

