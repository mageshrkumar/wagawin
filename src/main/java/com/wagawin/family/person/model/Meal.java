package com.wagawin.family.person.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "meal")
public class Meal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "meal_id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "invented")
	private Date invented;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child_id")
	@JsonIgnore
	private Child child;
	
	public Meal() {
		
	}
	
	public Meal(String name, Date invented) {
		this.name = name;
		this.invented = invented;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getInvented() {
		return invented;
	}

	public void setInvented(Date invented) {
		this.invented = invented;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}
}
