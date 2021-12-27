package com.vam.search.controller;

/**
* The Policy Search implements an application that
* displays Policy Details to the standard output based on the user id and role of the user.
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
import com.vam.search.domain.Policy;
import com.vam.search.service.PolicyService;

@CrossOrigin(origins = "*")
@RestController
public class PolicyController {

	@Autowired	
	PolicyService policyService;

	@PostMapping("/searchPolicy")
	@ResponseBody
	public List<Policy> getPolicyInfo(@RequestBody Policy policy) {
		return policyService.policySearch(policy);
	}	
	
}
