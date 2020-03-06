package com.example.book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<Response> handleBookNotFoundException(Exception e) {

		System.out.println("Inside Book not found global Exception handler..");
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		Response response = new Response();
		response.setStatus("failure");
		response.setError(e.getMessage());

		return new ResponseEntity<Response>(response, HttpStatus.NOT_FOUND);

	}

}
