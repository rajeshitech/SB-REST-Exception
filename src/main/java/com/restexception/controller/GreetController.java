package com.restexception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
		String s = null;
		s.length();
		return new ResponseEntity<String>("Good Evening...!",HttpStatus.OK);
	}
}
