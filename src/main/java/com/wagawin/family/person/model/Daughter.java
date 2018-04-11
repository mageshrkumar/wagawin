package com.wagawin.family.person.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "daughter")
@DiscriminatorValue("F")
public class Daughter extends Child implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "hair_color")
	private String hairColor;

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public Daughter() {
		
	}
}
