package com.techment.exception;

public class InvalidTokenException extends Exception {
	
	String msg;

	public InvalidTokenException(String msg) {
		super(msg);
		this.msg = msg;
	}
	

	public InvalidTokenException() {
		super();
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

	
}
