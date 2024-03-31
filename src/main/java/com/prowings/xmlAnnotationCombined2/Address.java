package com.prowings.xmlAnnotationCombined2;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Address {
	
	private int pinCode;
	private String city;
	private String contry;
	
	public Address() {
		super();
	}
	
	

	public Address(int pinCode, String city, String contry) {
		super();
		this.pinCode = pinCode;
		this.city = city;
		this.contry = contry;
	}



	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", city=" + city + ", contry=" + contry + "]";
	}
	
	

}
