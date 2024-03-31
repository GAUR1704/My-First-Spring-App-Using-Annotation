package com.prowings.xmlAnnotationCombined;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Bike {
	@Value(value = "1")
	private int id;
	@Value(value = "Sports")
	private String type;

	public Bike() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", type=" + type + "]";
	}

}
