package com.techment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = InvalidUserException.class)
	public ResponseEntity<String> myException(InvalidUserException exception)
	{
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.UNAUTHORIZED);
	}
	

	@ExceptionHandler(value=LoanApplicationNotFound.class)
	public ResponseEntity<String> myException(LoanApplicationNotFound exception) {
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=LoanApplicationAlreadyExist.class)
	public ResponseEntity<String> myException(LoanApplicationAlreadyExist exception) {
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
	}
	
	/*@ExceptionHandler(value=InvalidTokenException.class)
	public ResponseEntity<String>tokenException(InvalidTokenException exception){
		
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.NOT_FOUND);
	}
	*/

	@ExceptionHandler(value=InvalidTokenException.class)
	public ResponseEntity<String> TokenException(InvalidTokenException exception) {
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
	}
	
	
}
