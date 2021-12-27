package com.vam.search.domain;
/**
 * Policy POJO class
 * 
 * @author Sravan Kumar Kuruma
 * @version 1.0
 * @since   2020-07-10 
 * */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class Policy {

@Id
@Column(name="policy_no")
private Integer policy_no;

@Column(name="policy_name")
private String policy_name;

@Column(name="policy_start_date")
private Date policy_start_date;

@Column(name="policy_end_date")
private Date policy_end_date;

@Column(name="customer_id")
private Integer customer_id;

@Column(name="lob_name")
private String lob_name;

@Column(name="proposal_no")
private Integer proposal_no;

@Column(name="product_name")
private String product_name;

@Column(name="firstname")
private String firstname;

@Column(name="lastname")
private String lastname;

@Column(name="user_id")
private Integer user_id;

@Column(name="quote_no")
private Integer quote_no;

@Transient
private int page;

@Transient
private int limit=10;

public Policy() {
	super();

}

public Policy(Integer policy_no, String policy_name, Date policy_start_date, Date policy_end_date, Integer customer_id,
		String lob_name, Integer proposal_no, String product_name, String firstname, String lastname, Integer user_id,
		Integer quote_no,int page,int limit) {
	super();
	this.policy_no = policy_no;
	this.policy_name = policy_name;
	this.policy_start_date = policy_start_date;
	this.policy_end_date = policy_end_date;
	this.customer_id = customer_id;
	this.lob_name = lob_name;
	this.proposal_no = proposal_no;
	this.product_name = product_name;
	this.firstname = firstname;
	this.lastname = lastname;
	this.user_id = user_id;
	this.quote_no = quote_no;
	this.page = page;
	this.limit=limit;
}


}
