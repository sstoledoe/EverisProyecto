package com.everis.finals.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.everis.finals.service.PersonsService;
import com.everis.finals.models.Persons;

@RestController
public class PersonsController {
	
	
	@Autowired
	private PersonsService personsService;
	
	@GetMapping("/lista")
	public List<Persons> listar(){
		return personsService.findAll();
	}
	
	@GetMapping("/persons/{document}")
	public Persons getPersons (@PathVariable String document) {
		return personsService.findByDocument(document);
	}
	

}
