package com.wagawin.family.person.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.wagawin.family.person.model.ParentSummary;
import com.wagawin.family.person.repository.ParentSummaryRepository;

@Service
public class ParentSummaryService {
	private static final Logger log = LoggerFactory.getLogger(ParentSummaryService.class);


	@Autowired
	private ParentSummaryRepository repository;

	@Scheduled(cron = "0 0/15 * * * ?")
	public void saveParentSummary() {
		try {
		List<ParentSummary> list = repository.getParentSummary();
		repository.saveAll(list);
		}
		catch(Exception e) {
			log.debug("Error while saving the parent summary list", e);
		}
	}

	public List<ParentSummary> getParentSummaryList() {
		return repository.findAll();
	}

}
