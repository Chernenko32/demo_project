package com.example.demo_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.impl.PersonServiceImpl;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
		PersonServiceImpl p1 = new PersonServiceImpl();
		p1.getPersonServiceInfo("ABC");
		System.out.println(p1);

		Person per = p1.getPersonServiceInfo("ZZZ");
		System.out.println(per.getId());
		System.out.println(per.getName());
		System.out.println(per.getAge());
		System.out.println(per.getCity());
	}

}