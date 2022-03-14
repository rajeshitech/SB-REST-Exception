package com.restexception.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.restexception.userDefinedException.NoDataFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<String> handleArithemeticException(ArithmeticException ae) {
		
		String msg = "Number can't divide by zero";
		return new ResponseEntity<String>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<String> handleNPE(NullPointerException npe) {
		String msg = "Operation on null can't be done";
		return new ResponseEntity<String>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<String> handleNodatafoundexception(NoDataFoundException ndfe){
		String msg = ndfe.getMessage();
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
	}
}
