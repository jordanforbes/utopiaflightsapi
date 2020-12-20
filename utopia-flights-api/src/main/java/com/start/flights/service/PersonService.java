/**
 * 
 */
package com.start.flights.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.start.flights.dao.PersonDao;
import com.start.flights.model.Person;

/**
 * @author Jordf
 *
 */
@Service
public class PersonService {
	
	private final PersonDao personDao;
	
	@Autowired
	public PersonService(@Qualifier("mongo") PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.insertPerson(person);
		
	}

}
