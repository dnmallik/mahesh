package com.vam.search.domain;
/**
 * Proposal POJO class
 * 
 * @author Sravan Kumar Kuruma
 * @version 1.0
 * @since   2020-07-10 
 * */

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class Proposal {
	
	@Id
	@Column(name="proposal_no")
	private Integer proposal_no;
	
	@Column(name="quote_no")
	private Integer quote_no;
	
	@Column(name="customer_id")
	private Integer customer_id; 
	
	@Column(name="premium_amount")
	 private Integer premium_amount ;
	
	@Column(name="proposal_status")
	private String proposal_status;
	
	@Column(name="uw_approved")
	private String uw_approved;
	
	@Column(name="user_id")
	private Integer user_id;
	
	@Column(name="lob_name")
	private String lob_name;
	
	@Column(name="product_name")
	private String product_name;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="proposal_startdate")
	private Date proposal_startdate;

	@Transient
	private int page;

	@Transient
	private int limit=10;

	public Proposal() {
		super();
	}



	public Proposal(Integer proposal_no, Integer quote_no, Integer customer_id, Integer premium_amount,
			String proposal_status, String uw_approved, Integer user_id, String lob_name, String product_name,
			String firstname, String lastname, Date proposal_startdate,int page,int limit) {
		super();
		this.proposal_no = proposal_no;
		this.quote_no = quote_no;
		this.customer_id = customer_id;
		this.premium_amount = premium_amount;
		this.proposal_status = proposal_status;
		this.uw_approved = uw_approved;
		this.user_id = user_id;
		this.lob_name = lob_name;
		this.product_name = product_name;
		this.firstname = firstname;
		this.lastname = lastname;
		this.proposal_startdate = proposal_startdate;
		this.page = page;
		this.limit=limit;
	}


	
}
