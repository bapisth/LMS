package com.urja.model;
// Generated Jul 9, 2016 1:51:15 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * SignupId generated by hbm2java
 */
public class SignupId implements java.io.Serializable {

	private Integer customerid;
	private String password;
	private String status;
	private String otp;
	private Date stampdate;
	private String stampuser;

	public SignupId() {
	}

	public SignupId(Integer customerid, String password, String status, String otp, Date stampdate, String stampuser) {
		this.customerid = customerid;
		this.password = password;
		this.status = status;
		this.otp = otp;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
	}

	public Integer getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOtp() {
		return this.otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
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
		if (!(other instanceof SignupId))
			return false;
		SignupId castOther = (SignupId) other;

		return ((this.getCustomerid() == castOther.getCustomerid()) || (this.getCustomerid() != null
				&& castOther.getCustomerid() != null && this.getCustomerid().equals(castOther.getCustomerid())))
				&& ((this.getPassword() == castOther.getPassword()) || (this.getPassword() != null
						&& castOther.getPassword() != null && this.getPassword().equals(castOther.getPassword())))
				&& ((this.getStatus() == castOther.getStatus()) || (this.getStatus() != null
						&& castOther.getStatus() != null && this.getStatus().equals(castOther.getStatus())))
				&& ((this.getOtp() == castOther.getOtp()) || (this.getOtp() != null && castOther.getOtp() != null
						&& this.getOtp().equals(castOther.getOtp())))
				&& ((this.getStampdate() == castOther.getStampdate()) || (this.getStampdate() != null
						&& castOther.getStampdate() != null && this.getStampdate().equals(castOther.getStampdate())))
				&& ((this.getStampuser() == castOther.getStampuser()) || (this.getStampuser() != null
						&& castOther.getStampuser() != null && this.getStampuser().equals(castOther.getStampuser())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCustomerid() == null ? 0 : this.getCustomerid().hashCode());
		result = 37 * result + (getPassword() == null ? 0 : this.getPassword().hashCode());
		result = 37 * result + (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result + (getOtp() == null ? 0 : this.getOtp().hashCode());
		result = 37 * result + (getStampdate() == null ? 0 : this.getStampdate().hashCode());
		result = 37 * result + (getStampuser() == null ? 0 : this.getStampuser().hashCode());
		return result;
	}

}