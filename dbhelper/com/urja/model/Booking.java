package com.urja.model;
// Generated Jul 9, 2016 1:51:15 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Booking generated by hbm2java
 */
public class Booking implements java.io.Serializable {

	private Integer bookingid;
	private Integer orderid;
	private Integer customerid;
	private Integer serviceid;
	private int quantity;
	private int quantityinkg;
	private int charges;
	private Date bookingdatetime;
	private Date pickuptime1;
	private Date pickuptime2;
	private Date delivertime1;
	private Date delivertime2;
	private Integer addressid;
	private String status;
	private Date stampdate;
	private String stampuser;

	public Booking() {
	}

	public Booking(int quantity, int quantityinkg, int charges, Date bookingdatetime, Date pickuptime1,
			Date pickuptime2, Date delivertime1, Date delivertime2, String status, Date stampdate, String stampuser) {
		this.quantity = quantity;
		this.quantityinkg = quantityinkg;
		this.charges = charges;
		this.bookingdatetime = bookingdatetime;
		this.pickuptime1 = pickuptime1;
		this.pickuptime2 = pickuptime2;
		this.delivertime1 = delivertime1;
		this.delivertime2 = delivertime2;
		this.status = status;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
	}

	public Booking(Integer orderid, Integer customerid, Integer serviceid, int quantity, int quantityinkg, int charges,
			Date bookingdatetime, Date pickuptime1, Date pickuptime2, Date delivertime1, Date delivertime2,
			Integer addressid, String status, Date stampdate, String stampuser) {
		this.orderid = orderid;
		this.customerid = customerid;
		this.serviceid = serviceid;
		this.quantity = quantity;
		this.quantityinkg = quantityinkg;
		this.charges = charges;
		this.bookingdatetime = bookingdatetime;
		this.pickuptime1 = pickuptime1;
		this.pickuptime2 = pickuptime2;
		this.delivertime1 = delivertime1;
		this.delivertime2 = delivertime2;
		this.addressid = addressid;
		this.status = status;
		this.stampdate = stampdate;
		this.stampuser = stampuser;
	}

	public Integer getBookingid() {
		return this.bookingid;
	}

	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public Integer getServiceid() {
		return this.serviceid;
	}

	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantityinkg() {
		return this.quantityinkg;
	}

	public void setQuantityinkg(int quantityinkg) {
		this.quantityinkg = quantityinkg;
	}

	public int getCharges() {
		return this.charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public Date getBookingdatetime() {
		return this.bookingdatetime;
	}

	public void setBookingdatetime(Date bookingdatetime) {
		this.bookingdatetime = bookingdatetime;
	}

	public Date getPickuptime1() {
		return this.pickuptime1;
	}

	public void setPickuptime1(Date pickuptime1) {
		this.pickuptime1 = pickuptime1;
	}

	public Date getPickuptime2() {
		return this.pickuptime2;
	}

	public void setPickuptime2(Date pickuptime2) {
		this.pickuptime2 = pickuptime2;
	}

	public Date getDelivertime1() {
		return this.delivertime1;
	}

	public void setDelivertime1(Date delivertime1) {
		this.delivertime1 = delivertime1;
	}

	public Date getDelivertime2() {
		return this.delivertime2;
	}

	public void setDelivertime2(Date delivertime2) {
		this.delivertime2 = delivertime2;
	}

	public Integer getAddressid() {
		return this.addressid;
	}

	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
