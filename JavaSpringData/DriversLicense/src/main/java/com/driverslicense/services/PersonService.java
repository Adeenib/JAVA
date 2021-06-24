package com.driverslicense.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.driverslicense.models.License;
import com.driverslicense.models.Person;
import com.driverslicense.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personrepository;
	
	public PersonService(PersonRepository personrepository) {
		this.personrepository = personrepository;
	}

	public  List<Person> findAllPersons() {
		return (List<Person>) personrepository.findByLicenseIdIsNull();
		
	}
	public void creatNewPearson(Person person) {
		personrepository.save(person);
	}
	public Person gitById(Long id) {
		return personrepository.findById(id).orElse(null);
		
	}

}
