package com.examples.capstone.AadharRestApi.Exception;

public class CitizenNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -3056713282431174712L;

	public CitizenNotFoundException(int id) {
		super("Citizen with id " + id + " is not Found.Pls Give another id!!");
	}

}
