package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.service.ifs.Active;

@SpringBootTest
class DemoProjectApplicationTests {
	@Autowired
	private Active aa;
	@Test
	public void contextLoads() {
		aa.fly("asd", 20);
	}

	@Test
	public void contextLoads1() {
	}

}
