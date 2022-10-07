package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Person;

public interface PersonService {
	default Person getPersonServiceInfo(String id) {
		return new Person();
	}
	
}
