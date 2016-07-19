package com.urja.model;
// Generated Jul 19, 2016 11:26:33 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * BackofficeuserId generated by hbm2java
 */
public class BackofficeuserId implements java.io.Serializable {

	private Integer userid;
	private String firstname;
	private String middlename;
	private String lastname;
	private String email;
	private String phone1;
	private String phone2;
	private String passowrd;
	private String usertype;
	private Date stampdate;
	private String stampuser;

	public BackofficeuserId() {
	}

	public BackofficeuserId(String email, String phone1) {
		this.email = email;
		this.phone1 = phone1;
	}

	public BackofficeuserId(Integer userid, String firstname, String middlename, String lastname, String email,
			String phone1, String phone2, String passowrd, String usertype, Date stampdate, String stampuser) {
		this.userid = userid;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.passowrd = passowrd;
		this.usertype = usertype;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPassowrd() {
		return this.passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public Date getStampdate() {
		return this.stampdate;
	}

	public void setStampdate(Date stampdate) {
		this.stampdate = stampdate;
	}

	public String getStampuser() {
		return this.stampuser;
	}

	public void setStampuser(String stampuser) {
		this.stampuser = stampuser;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BackofficeuserId))
			return false;
		BackofficeuserId castOther = (BackofficeuserId) other;

		return ((this.getUserid() == castOther.getUserid()) || (this.getUserid() != null
				&& castOther.getUserid() != null && this.getUserid().equals(castOther.getUserid())))
				&& ((this.getFirstname() == castOther.getFirstname()) || (this.getFirstname() != null
						&& castOther.getFirstname() != null && this.getFirstname().equals(castOther.getFirstname())))
				&& ((this.getMiddlename() == castOther.getMiddlename()) || (this.getMiddlename() != null
						&& castOther.getMiddlename() != null && this.getMiddlename().equals(castOther.getMiddlename())))
				&& ((this.getLastname() == castOther.getLastname()) || (this.getLastname() != null
						&& castOther.getLastname() != null && this.getLastname().equals(castOther.getLastname())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getPhone1() == castOther.getPhone1()) || (this.getPhone1() != null
						&& castOther.getPhone1() != null && this.getPhone1().equals(castOther.getPhone1())))
				&& ((this.getPhone2() == castOther.getPhone2()) || (this.getPhone2() != null
						&& castOther.getPhone2() != null && this.getPhone2().equals(castOther.getPhone2())))
				&& ((this.getPassowrd() == castOther.getPassowrd()) || (this.getPassowrd() != null
						&& castOther.getPassowrd() != null && this.getPassowrd().equals(castOther.getPassowrd())))
				&& ((this.getUsertype() == castOther.getUsertype()) || (this.getUsertype() != null
						&& castOther.getUsertype() != null && this.getUsertype().equals(castOther.getUsertype())))
				&& ((this.getStampdate() == castOther.getStampdate()) || (this.getStampdate() != null
						&& castOther.getStampdate() != null && this.getStampdate().equals(castOther.getStampdate())))
				&& ((this.getStampuser() == castOther.getStampuser()) || (this.getStampuser() != null
						&& castOther.getStampuser() != null && this.getStampuser().equals(castOther.getStampuser())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserid() == null ? 0 : this.getUserid().hashCode());
		result = 37 * result + (getFirstname() == null ? 0 : this.getFirstname().hashCode());
		result = 37 * result + (getMiddlename() == null ? 0 : this.getMiddlename().hashCode());
		result = 37 * result + (getLastname() == null ? 0 : this.getLastname().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getPhone1() == null ? 0 : this.getPhone1().hashCode());
		result = 37 * result + (getPhone2() == null ? 0 : this.getPhone2().hashCode());
		result = 37 * result + (getPassowrd() == null ? 0 : this.getPassowrd().hashCode());
		result = 37 * result + (getUsertype() == null ? 0 : this.getUsertype().hashCode());
		result = 37 * result + (getStampdate() == null ? 0 : this.getStampdate().hashCode());
		result = 37 * result + (getStampuser() == null ? 0 : this.getStampuser().hashCode());
		return result;
	}

}
