package com.restexception.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restexception.userDefinedException.NoDataFoundException;

@RestController
public class TicketRestController {

	@GetMapping("/ticket/status/{pnr}")
	public ResponseEntity<String> getStatus(@PathVariable String pnr) {
		throw new NoDataFoundException("Ticket Not Found.");
	}
}
