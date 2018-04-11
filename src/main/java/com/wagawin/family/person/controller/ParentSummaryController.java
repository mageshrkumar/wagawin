package com.wagawin.family.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.family.person.model.ParentSummary;
import com.wagawin.family.person.service.ParentSummaryService;

@RestController
@RequestMapping(value = "/api/persons")
public class ParentSummaryController {

	@Autowired
	private ParentSummaryService parentSummaryService;
	
	
	@GetMapping("/children")
	public List<ParentSummary> getSummaryList(){
		return parentSummaryService.getParentSummaryList();
		
	}
}
