package com.vam.search.domain;

/**
 * Customer POJO class
 * 
 * @author Divakar Medchalam
 * @version 1.0
 * @since   2020-07-10 
 * */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class Customer {
	
@Id
@Column(name="customer_id")
private Integer customer_id;

@Column(name="firstname")
private String firstname;

@Column(name="lastname")
private String lastname;

@Column(name="mobile_no")
private String mobile_no;

@Column(name="email_id")
private String email_id;

@Column(name="policy_no")
private Integer policy_no;

@Column(name="lob_name")
private String lob_name;

@Column(name="product_name")
private String product_name;

@Column(name="quote_no")
private Integer quote_no;

@Column(name="user_id")
private Integer user_id;

@Column(name="role_id")
private Integer role_id;

@Column(name="proposal_no")
private Integer proposal_no;

@Column(name="type")
private String type;

@Transient
private int page;

@Transient
private int limit=10;

public Customer(Integer customer_id, String firstname, String lastname, String mobile_no, String email_id,
		Integer policy_no, String lob_name, String product_name, Integer quote_no, Integer user_id, Integer role_id,
		Integer proposal_no, String type,int page,int limit) {
	super();
	this.customer_id = customer_id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.mobile_no = mobile_no;
	this.email_id = email_id;
	this.policy_no = policy_no;
	this.lob_name = lob_name;
	this.product_name = product_name;
	this.quote_no = quote_no;
	this.user_id = user_id;
	this.role_id = role_id;
	this.proposal_no = proposal_no;
	this.type = type;
	this.page = page;
	this.limit=limit;
}

public Customer() {
	super();

}


	
}
