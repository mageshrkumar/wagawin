package com.wagawin.family.person.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblparentsummary")
public class ParentSummary implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "amount_of_persons")
	private long amountOfPersons;

	@Column(name = "amount_of_child")
	private long amountOfChild;

	public ParentSummary() {

	}

	public ParentSummary(long amountOfPersons, long amountOfChild) {
		this.amountOfPersons = amountOfPersons;
		this.amountOfChild = amountOfChild;
	}

	public long getAmountOfPersons() {
		return amountOfPersons;
	}

	public void setAmountOfPersons(long amountOfPersons) {
		this.amountOfPersons = amountOfPersons;
	}

	public long getAmountOfChild() {
		return amountOfChild;
	}

	public void setAmountOfChild(long amountOfChild) {
		this.amountOfChild = amountOfChild;
	}

}
