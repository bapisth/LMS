package com.urja.model;
// Generated Jul 19, 2016 11:26:33 PM by Hibernate Tools 4.3.1.Final

/**
 * Bookingitems generated by hbm2java
 */
public class Bookingitems implements java.io.Serializable {

	private Long bookingItemId;
	private Booking booking;
	private Serviceitems serviceitems;
	private int itemquantity;
	private float totaliteminkg;
	private double totalcharges;

	public Bookingitems() {
	}

	public Bookingitems(Booking booking, Serviceitems serviceitems, int itemquantity, float totaliteminkg,
			double totalcharges) {
		this.booking = booking;
		this.serviceitems = serviceitems;
		this.itemquantity = itemquantity;
		this.totaliteminkg = totaliteminkg;
		this.totalcharges = totalcharges;
	}

	public Long getBookingItemId() {
		return this.bookingItemId;
	}

	public void setBookingItemId(Long bookingItemId) {
		this.bookingItemId = bookingItemId;
	}

	public Booking getBooking() {
		return this.booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Serviceitems getServiceitems() {
		return this.serviceitems;
	}

	public void setServiceitems(Serviceitems serviceitems) {
		this.serviceitems = serviceitems;
	}

	public int getItemquantity() {
		return this.itemquantity;
	}

	public void setItemquantity(int itemquantity) {
		this.itemquantity = itemquantity;
	}

	public float getTotaliteminkg() {
		return this.totaliteminkg;
	}

	public void setTotaliteminkg(float totaliteminkg) {
		this.totaliteminkg = totaliteminkg;
	}

	public double getTotalcharges() {
		return this.totalcharges;
	}

	public void setTotalcharges(double totalcharges) {
		this.totalcharges = totalcharges;
	}

}
