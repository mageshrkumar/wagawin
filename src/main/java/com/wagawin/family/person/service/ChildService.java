package com.wagawin.family.person.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagawin.family.person.RequestProcessingException;
import com.wagawin.family.person.model.Child;
import com.wagawin.family.person.model.Meal;
import com.wagawin.family.person.model.ParentMealDTO;
import com.wagawin.family.person.model.Person;
import com.wagawin.family.person.repository.ChildRepository;

@Service
public class ChildService {

	@Autowired
	private ChildRepository childRepository;

	public Child getColorByChild(long id) {
		Optional<Child> optional = childRepository.findById(id);
		return optional.get();
	}

	public Child getChild(long id) {
		Optional<Child> optional = childRepository.findById(id);
		if (!optional.isPresent()) {
			throw new RequestProcessingException("Unable to get child for given id" + id);
		}
		return optional.get();
	}

	public ParentMealDTO getParentMealDTO(long childId) {
		Child child = getChild(childId);
		List<Meal> meals = child.getMeals();
		if (meals.isEmpty()) {
			throw new RequestProcessingException("Favourite meal is not available for given child id");
		}
		Person person = child.getPerson();
		if (person == null) {
			throw new RequestProcessingException("Parent is not found for given child id");
		}
		ParentMealDTO dto = new ParentMealDTO(person, meals.get(0));
		return dto;

	}
}
