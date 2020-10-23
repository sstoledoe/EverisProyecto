package com.everis.finals.repository;

import org.springframework.data.repository.CrudRepository;

import com.everis.finals.models.Persons;

public interface PersonsRepository extends CrudRepository <Persons, String>{

	public Persons findByDocument(String document);
	
	
	

}
