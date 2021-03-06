package com.urja.model;
// Generated Jul 19, 2016 11:26:33 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Servicegroup generated by hbm2java
 */
public class Servicegroup implements java.io.Serializable {

	private int servicegroupcode;
	private String servicegrouptype;
	private String servicegroupdesc;
	private Date stampdate;
	private String stampuser;
	private Set serviceses = new HashSet(0);

	public Servicegroup() {
	}

	public Servicegroup(int servicegroupcode, String servicegrouptype, String servicegroupdesc, Date stampdate,
			String stampuser) {
		this.servicegroupcode = servicegroupcode;
		this.servicegrouptype = servicegrouptype;
		this.servicegroupdesc = servicegroupdesc;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
	}

	public Servicegroup(int servicegroupcode, String servicegrouptype, String servicegroupdesc, Date stampdate,
			String stampuser, Set serviceses) {
		this.servicegroupcode = servicegroupcode;
		this.servicegrouptype = servicegrouptype;
		this.servicegroupdesc = servicegroupdesc;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
		this.serviceses = serviceses;
	}

	public int getServicegroupcode() {
		return this.servicegroupcode;
	}

	public void setServicegroupcode(int servicegroupcode) {
		this.servicegroupcode = servicegroupcode;
	}

	public String getServicegrouptype() {
		return this.servicegrouptype;
	}

	public void setServicegrouptype(String servicegrouptype) {
		this.servicegrouptype = servicegrouptype;
	}

	public String getServicegroupdesc() {
		return this.servicegroupdesc;
	}

	public void setServicegroupdesc(String servicegroupdesc) {
		this.servicegroupdesc = servicegroupdesc;
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

	public Set getServiceses() {
		return this.serviceses;
	}

	public void setServiceses(Set serviceses) {
		this.serviceses = serviceses;
	}

}
