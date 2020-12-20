/**
 * 
 */
package com.start.flights.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.start.flights.model.Person;
import com.start.flights.service.PersonService;

/**
 * @author Jordf
 *
 */

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
	
	private final PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	//Post request 
	@PostMapping
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}

}
