/**
 * 
 */
package com.start.flights.dao;

import java.util.UUID;

import com.start.flights.model.Person;

/**
 * @author Jordf
 *
 */
public interface PersonDao {
	
	int insertPerson(UUID id, Person person);
	
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}

}
