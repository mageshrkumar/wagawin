package com.wagawin.family.person.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "son")
@DiscriminatorValue("M")
public class Son extends Child {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "bicycle_color")
	private String bicycleColor;

	public String getBicycleColor() {
		return bicycleColor;
	}

	public void setBicycleColor(String bicycleColor) {
		this.bicycleColor = bicycleColor;
	}

	public Son() {

	}
}
