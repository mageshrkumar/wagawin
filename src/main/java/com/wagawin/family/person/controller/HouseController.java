package com.wagawin.family.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.family.person.RequestProcessingException;
import com.wagawin.family.person.model.House;
import com.wagawin.family.person.service.HouseService;

@RestController
public class HouseController {

	@Autowired
	private HouseService houseService;

	@RequestMapping(value = "/api/house")
	public House getHouseByPerson(@RequestParam("id") long personId) {
		if(personId<=0) {
			throw new RequestProcessingException("given identifier is not valid");
		}
		return houseService.getHouseByPersonId(personId);
	}

}
