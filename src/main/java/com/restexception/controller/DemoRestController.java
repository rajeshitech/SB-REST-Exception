package com.restexception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		String s = null;
//		s.length();
		
		int i = 10 / 0;
		String msg = "Welcome to rest controller...!! and String length ";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

//	@ExceptionHandler(value = ArithmeticException.class)
//	public ResponseEntity<String> handleArithmeticExeception(ArithmeticException ae) {
//		return new ResponseEntity<String>("Number can't divide by Zero", HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//
//	@ExceptionHandler(value = NullPointerException.class)
//	public ResponseEntity<String> handleNPE(NullPointerException npe) {
//		return new ResponseEntity<String>("Operation on null cannot be possible",HttpStatus.INTERNAL_SERVER_ERROR);
//	}
}
