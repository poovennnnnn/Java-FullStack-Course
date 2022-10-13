package com.blog.execptions;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.blog.dto.ErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler {
	
	



	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleResourseNotFoundException(
			ResourceNotFoundException  exception,WebRequest webRequest
			
			){
		
		
		ErrorDetails details = new ErrorDetails(new Date(),exception.getMessage(),webRequest.getDescription(false));
		
		return new ResponseEntity<>(details,HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		Map<String,String> errors = new HashMap<>();
	
		
		ex.getBindingResult()
		.getAllErrors()
		.forEach((error)->{
			
			String message = error.getDefaultMessage();
			String field =((FieldError)error).getField();
			errors.put(field, message);
		
		});
		
		return new  ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
	
	}

	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllException(
			Exception  exception,WebRequest webRequest
			
			){
		
		
		ErrorDetails details = new ErrorDetails(new Date(),exception.getMessage(),webRequest.getDescription(false));
		
		return new ResponseEntity<>(details,HttpStatus.BAD_REQUEST);
	}


	

}
