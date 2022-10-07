package com.example.demo_project.service.impl;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

public class PersonServiceImpl implements PersonService {

	@Override
	public Person getPersonServiceInfo(String id) {
		Person person = new Person();
		person.setId(id);
		person.setName("JACK");
		person.setAge(26);
		person.setCity("MOCKBA");
		return person;
	}

//	public void printPersonAttibutes(Person person) {
//		System.out.println(person.getId());
//		System.out.println(person.getName());
//		System.out.println(person.getAge());
//		System.out.println(person.getCity());
//	}
}
