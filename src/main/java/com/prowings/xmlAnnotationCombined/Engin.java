package com.prowings.xmlAnnotationCombined;

public class Engin {
	
	private int id;
	private String name;
	
	public Engin() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Engin [id=" + id + ", name=" + name + "]";
	}
	
	

}
