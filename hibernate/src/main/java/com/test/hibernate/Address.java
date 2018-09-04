package com.test.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String street;
	private int hono;
	private String city;
	private String state;
	private int pincode;
	
	public Address() {
		
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHono() {
		return hono;
	}

	public void setHono(int hono) {
		this.hono = hono;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
