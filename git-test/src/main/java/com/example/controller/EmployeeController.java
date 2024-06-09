package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping
	public String hello() {

		return "hello";

	}
	
	@GetMapping
	public String hello6() {

		return "hello6";

	}

}
