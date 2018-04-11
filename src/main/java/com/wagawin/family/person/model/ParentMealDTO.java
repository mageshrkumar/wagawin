package com.wagawin.family.person.model;

import java.io.Serializable;

public class ParentMealDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Person person;

	private Meal meal;

	public ParentMealDTO() {

	}

	public ParentMealDTO(Person person, Meal meal) {
		this.person = person;
		this.meal = meal;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}
}
