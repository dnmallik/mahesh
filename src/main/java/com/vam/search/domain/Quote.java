package com.vam.search.domain;

/**
 * Quote POJO class
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
public class Quote {
	
@Id
@Column(name="quote_no")
private Integer quote_no;

@Column(name="firstname")
private String firstname;

@Column(name="lastname")
private String lastname;

@Column(name="customer_id")
private Integer customer_id;

@Column(name="user_id")
private Integer user_id;

@Column(name="lob_name")
private String lob_name;

@Column(name="product_id")
private Integer product_id;

@Column(name="product_name")
private String product_name;


@Column(name="quote_status")
private String quote_status;

@Column(name="approved_by")
private String approved_by;

@Transient
private int page;

@Transient
private int limit=10;

public Quote() {
	super();
}


public Quote(Integer quote_no, String firstname, String lastname, Integer customer_id, Integer user_id, String lob_name,
		Integer product_id, String product_name, String quote_status, String approved_by,int page,int limit) {
	super();
	this.quote_no = quote_no;
	this.firstname = firstname;
	this.lastname = lastname;
	this.customer_id = customer_id;
	this.user_id = user_id;
	this.lob_name = lob_name;
	this.product_id = product_id;
	this.product_name = product_name;
	this.quote_status = quote_status;
	this.approved_by = approved_by;
	this.page = page;
	this.limit=limit;
}

}