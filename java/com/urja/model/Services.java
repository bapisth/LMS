package com.urja.model;
// Generated Jul 19, 2016 11:26:33 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Services generated by hbm2java
 */
public class Services implements java.io.Serializable {

	private Integer serviceid;
	private Servicegroup servicegroup;
	private String servicename;
	private int servicecode;
	private String servicedesc;
	private Date stampdate;
	private String stampuser;
	private Set serviceitemses = new HashSet(0);

	public Services() {
	}

	public Services(Servicegroup servicegroup, String servicename, int servicecode, String servicedesc, Date stampdate,
			String stampuser) {
		this.servicegroup = servicegroup;
		this.servicename = servicename;
		this.servicecode = servicecode;
		this.servicedesc = servicedesc;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
	}

	public Services(Servicegroup servicegroup, String servicename, int servicecode, String servicedesc, Date stampdate,
			String stampuser, Set serviceitemses) {
		this.servicegroup = servicegroup;
		this.servicename = servicename;
		this.servicecode = servicecode;
		this.servicedesc = servicedesc;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
		this.serviceitemses = serviceitemses;
	}

	public Integer getServiceid() {
		return this.serviceid;
	}

	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}

	public Servicegroup getServicegroup() {
		return this.servicegroup;
	}

	public void setServicegroup(Servicegroup servicegroup) {
		this.servicegroup = servicegroup;
	}

	public String getServicename() {
		return this.servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public int getServicecode() {
		return this.servicecode;
	}

	public void setServicecode(int servicecode) {
		this.servicecode = servicecode;
	}

	public String getServicedesc() {
		return this.servicedesc;
	}

	public void setServicedesc(String servicedesc) {
		this.servicedesc = servicedesc;
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

	public Set getServiceitemses() {
		return this.serviceitemses;
	}

	public void setServiceitemses(Set serviceitemses) {
		this.serviceitemses = serviceitemses;
	}

}
