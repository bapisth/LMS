package com.urja.model.util;

import com.urja.model.Address;
import com.urja.model.AddressHome;

public class UtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setAddress1("BBSR");
		address.setAddress2("BLS");
		address.setCountry("India");
		address.setPostalcode("PO1234");
		
		new AddressHome().save(address);

	}

}
