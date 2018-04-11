package com.wagawin.family.person.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "house")
public class House implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "house_id")
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "person"))
	private long id;

	@Column(name = "address")
	private String address;

	@Column(name = "zip_code")
	private String zipCode;

	@Enumerated(EnumType.STRING)
	@Column(name = "house_type")
	private HouseType type;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Person person;

	public House() {

	}

	public House(String address, String zipCode, HouseType houseType) {
		this.address = address;
		this.zipCode = zipCode;
		this.type = houseType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public HouseType getType() {
		return type;
	}

	public void setType(HouseType type) {
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
