package com.yash.plm.exception;

public class UserNotFoundException extends Exception {
	public UserNotFoundException(){
		super();
	}
	public UserNotFoundException(String errMsg) {
		super(errMsg);
	}
}
