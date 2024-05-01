package com.ciq.model;

public class ResponseObj {

	private Integer statusCode;
	private Object result;

	public ResponseObj() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseObj(Integer statusCode, Object result) {
		super();
		this.statusCode = statusCode;
		this.result = result;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "ResponseObj [statusCode=" + statusCode + ", result=" + result + "]";
	}

}
