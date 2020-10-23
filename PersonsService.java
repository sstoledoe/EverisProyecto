package com.everis.finals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*import org.springframework.transaction.annotation.Transactional;*/
import org.springframework.transaction.annotation.Transactional;

import com.everis.finals.models.Persons;
import com.everis.finals.repository.PersonsRepository;



@Service
public class PersonsService implements BaseService{

	@Autowired
	private PersonsRepository personsRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persons> findAll() {
		return (List<Persons>) personsRepository.findAll();
	}

	/*@Override
	@Transactional(readOnly = true)
	public Persons findById(String document) {
		return personsRepository.findById(document).orElse(null);
	}*/
	
	@Override
	public Persons findByDocument(String document) {
		return  personsRepository.findByDocument(document);
	}

	

	
	
	
	
	
	

}
