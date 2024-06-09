package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/hello")
	public String hello() {

		return "hello";

	}
	

	@GetMapping
	public String hello6() {

		return "hello6";

	}

	@GetMapping("/hello1")
	public String hello1() {

		return "hello1";

	}
	
	
	@GetMapping("/hello2")
	public String hello2() {

		return "hello2";

	}
	
	


}
