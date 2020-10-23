package com.everis.finals.service;

import java.util.List;

import com.everis.finals.models.Persons;



public interface BaseService {
	
	public List<Persons> findAll();
	public Persons findByDocument(String document);

}
