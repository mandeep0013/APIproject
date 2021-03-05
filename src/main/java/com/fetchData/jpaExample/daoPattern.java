package com.fetchData.jpaExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "customer_table")


public class daoPattern {
	
	public daoPattern() {
		super();
	}

	public daoPattern(Integer customer_id, String firstname, String i, String email, String j) {
		super();
		this.customer_id = customer_id;
		this.firstname = firstname;
		this.lastname = i;
		this.email = email;
		this.phoneno = j;
	}

	
	
	@Column(name = "customer_id") 
	Integer customer_id;
	
	@Column(name = "firstname") 
	String firstname;
	
	@Column(name = "lastname") 
	String lastname;
	
	@Column(name = "email") 
	String email;
	
	@Column(name = "phoneno") 
	String phoneno;

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
}
