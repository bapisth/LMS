package com.urja.model;
// Generated Jul 19, 2016 11:26:33 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Serviceitems generated by hbm2java
 */
public class Serviceitems implements java.io.Serializable {

	private Integer serviceitemid;
	private Items items;
	private Services services;
	private float chargesperkg;
	private float discount;
	private Date stampdate;
	private String stampuser;
	private Set bookingitemses = new HashSet(0);

	public Serviceitems() {
	}

	public Serviceitems(Items items, Services services, float chargesperkg, float discount, Date stampdate,
			String stampuser) {
		this.items = items;
		this.services = services;
		this.chargesperkg = chargesperkg;
		this.discount = discount;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
	}

	public Serviceitems(Items items, Services services, float chargesperkg, float discount, Date stampdate,
			String stampuser, Set bookingitemses) {
		this.items = items;
		this.services = services;
		this.chargesperkg = chargesperkg;
		this.discount = discount;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
		this.bookingitemses = bookingitemses;
	}

	public Integer getServiceitemid() {
		return this.serviceitemid;
	}

	public void setServiceitemid(Integer serviceitemid) {
		this.serviceitemid = serviceitemid;
	}

	public Items getItems() {
		return this.items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public Services getServices() {
		return this.services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public float getChargesperkg() {
		return this.chargesperkg;
	}

	public void setChargesperkg(float chargesperkg) {
		this.chargesperkg = chargesperkg;
	}

	public float getDiscount() {
		return this.discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
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

	public Set getBookingitemses() {
		return this.bookingitemses;
	}

	public void setBookingitemses(Set bookingitemses) {
		this.bookingitemses = bookingitemses;
	}

}
