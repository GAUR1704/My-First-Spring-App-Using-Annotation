package com.prowings.xmlAnnotationCombined;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Bus {
	
	private int id;
	//@Autowired
	private String company;
	private String type;
	//@Autowired
	public Bus() {
		super();
	}
	
	

	public Bus(int id, String company, String type) {
		super();
		this.id = id;
		this.company = company;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
//@Autowired
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", company=" + company + ", type=" + type + "]";
	}
	
}
