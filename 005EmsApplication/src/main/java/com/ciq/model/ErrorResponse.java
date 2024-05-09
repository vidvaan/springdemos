package com.ciq.model;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	
	private String errorMsg;
	private HttpStatus httpStatus;
	private Date exceptionCreatedDate;
	private String path;
	public ErrorResponse(String errorMsg, HttpStatus httpStatus, Date exceptionCreatedDate, String path) {
		super();
		this.errorMsg = errorMsg;
		this.httpStatus = httpStatus;
		this.exceptionCreatedDate = exceptionCreatedDate;
		this.path = path;
	}
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public Date getExceptionCreatedDate() {
		return exceptionCreatedDate;
	}
	public void setExceptionCreatedDate(Date exceptionCreatedDate) {
		this.exceptionCreatedDate = exceptionCreatedDate;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	

}
