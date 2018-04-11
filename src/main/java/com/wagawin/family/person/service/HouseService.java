package com.wagawin.family.person.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagawin.family.person.RequestProcessingException;
import com.wagawin.family.person.model.House;
import com.wagawin.family.person.repository.HouseRepository;

@Service
public class HouseService {

	private static final Logger log = LoggerFactory.getLogger(HouseService.class);

	@Autowired
	private HouseRepository houseRepository;

	public House getHouseByPersonId(long personId) {

		Optional<House> optional = houseRepository.findById(personId);
		if (!optional.isPresent()) {
			log.debug("Unable to find the house for given id " + personId);
			throw new RequestProcessingException("Unable to find the house for given person");
		}
		return optional.get();
	}

}
