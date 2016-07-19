package com.urja.model;
// Generated Jul 19, 2016 11:26:33 PM by Hibernate Tools 4.3.1.Final

/**
 * Signup generated by hbm2java
 */
public class Signup implements java.io.Serializable {

	private SignupId id;
	private Customer customer;

	public Signup() {
	}

	public Signup(SignupId id) {
		this.id = id;
	}

	public Signup(SignupId id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}

	public SignupId getId() {
		return this.id;
	}

	public void setId(SignupId id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
