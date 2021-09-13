package com.techment.exception;

public class LoanApplicationAlreadyExist extends RuntimeException {

	public String msg;

	
	public LoanApplicationAlreadyExist() {
		super();
	}

	public LoanApplicationAlreadyExist(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
