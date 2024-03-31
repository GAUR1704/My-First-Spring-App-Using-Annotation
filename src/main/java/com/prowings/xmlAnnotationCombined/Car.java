package com.prowings.xmlAnnotationCombined;

import org.springframework.beans.factory.annotation.Autowired;


public class Car {

	private int id;
	private String company;
	
	@Autowired
	private Engin engin;
	
	public Car() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Engin getEngin() {
		return engin;
	}

	public void setEngin(Engin engin) {
		this.engin = engin;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + ", engin=" + engin + "]";
	}

	

	
	
}
