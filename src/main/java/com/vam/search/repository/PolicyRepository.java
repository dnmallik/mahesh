package com.vam.search.repository;

/**
* PolicyRepository interface is a repository to connect to the DB 
* and get results from the MySQL database. 
*
* @author  Sravan Kumar Kuruma
* @version 1.0
* @since   2020-07-10 
*/
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vam.search.domain.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, String> {
	
	/* This method calls the getPolicyDetails() 
	 * stored procedure with input parameters whose return type is of 
	 * List<Policy>. */
	
	@Query(nativeQuery = true, value = "call get_policyDetails(?1,?2,?3,?4,?5,?6,?7,?8,?9)")
	public List<Policy> getPolicyDetails(Integer user_id, String firstname, String lastname, String lob_name,
			String product_name, Integer customer_id, Integer policy_no,int page,int limit);	

}
