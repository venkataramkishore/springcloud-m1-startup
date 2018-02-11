package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcloudM1StartupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM1StartupApplication.class, args);
	}
	
	@RequestMapping(value="/greeting", method=org.springframework.web.bind.annotation.RequestMethod.GET)
	public String sayHello () {
		return "Hey kishore welcome back to Java ..!!";
	}
}
