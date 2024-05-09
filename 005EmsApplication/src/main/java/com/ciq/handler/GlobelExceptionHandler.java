package com.ciq.handler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ciq.exception.EmployeeNotFoundException;
import com.ciq.exception.InvalidRequestException;
import com.ciq.model.ErrorResponse;

@ControllerAdvice
public class GlobelExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		List<ObjectError> errorObjs = ex.getAllErrors();

		HashMap<String, String> errors = new HashMap<>();

		for (ObjectError objectError : errorObjs) {

			String fieldName = ((FieldError) objectError).getField();
			String errorMsg = ((FieldError) objectError).getDefaultMessage();
			errors.put(fieldName, errorMsg);
		}

		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);

	}
	
	
	@ExceptionHandler(InvalidRequestException.class)
	public ResponseEntity<?> handleInvalidRequestException(InvalidRequestException invalidRequestException){
		
	    ErrorResponse errorResponse = new ErrorResponse();
	    errorResponse.setErrorMsg(invalidRequestException.getMessage());
	    errorResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
	    errorResponse.setExceptionCreatedDate(new Date());
	    errorResponse.setPath("/rest/emps");
		return new ResponseEntity<Object>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<?> handleEmployeeNotFoundException(EmployeeNotFoundException employeeNotFoundException){
		
	    ErrorResponse errorResponse = new ErrorResponse();
	    errorResponse.setErrorMsg(employeeNotFoundException.getMessage());
	    errorResponse.setHttpStatus(HttpStatus.NOT_FOUND);
	    errorResponse.setExceptionCreatedDate(new Date());
	    errorResponse.setPath("/rest/emps");
		return new ResponseEntity<Object>(errorResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exception){
		
	    ErrorResponse errorResponse = new ErrorResponse();
	    errorResponse.setErrorMsg(exception.getMessage());
	    errorResponse.setHttpStatus(HttpStatus.SERVICE_UNAVAILABLE);
	    errorResponse.setExceptionCreatedDate(new Date());
	    errorResponse.setPath("/rest/emps");
		return new ResponseEntity<Object>(errorResponse, HttpStatus.SERVICE_UNAVAILABLE);
	}

}
