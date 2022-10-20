package com.examples.capstone.AadharRestApi.Exception;

public class UserNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(int id) {
		super("User with id " + id + " is not Found.Pls Give another id!!");
	}

}
