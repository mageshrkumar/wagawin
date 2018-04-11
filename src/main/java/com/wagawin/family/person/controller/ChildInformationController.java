package com.wagawin.family.person.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.family.person.RequestProcessingException;
import com.wagawin.family.person.model.Child;
import com.wagawin.family.person.model.Daughter;
import com.wagawin.family.person.model.ParentMealDTO;
import com.wagawin.family.person.model.Son;
import com.wagawin.family.person.service.ChildService;

@RestController
@RequestMapping(value = "/api/child")
public class ChildInformationController {

	private static final Logger log = LoggerFactory.getLogger(ChildInformationController.class);

	@Autowired
	private ChildService childService;

	@GetMapping("/color")
	public Map<String, String> getColorByChild(@RequestParam("id") long childId) {
		if (childId <= 0) {
			log.debug("given id is not valid,id must need to be greater than 0");
			throw new RequestProcessingException("Given identifier is not valid");
		}
		Map<String, String> color = new HashMap<>();
		Child child = childService.getChild(childId);
		if (child instanceof Son) {
			color.put("bicycleColor", ((Son) child).getBicycleColor());
		} else {
			color.put("hairColor", ((Daughter) child).getHairColor());
		}
		return color;
	}

	@GetMapping("/info")
	public ParentMealDTO getFavouriteMealandDTO(@RequestParam("id") long childId) {
		if (childId <= 0) {
			log.debug("given id is not valid,id must need to be greater than 0");
			throw new RequestProcessingException("Given identifier is not valid");
		}
		return childService.getParentMealDTO(childId);
	}

}
