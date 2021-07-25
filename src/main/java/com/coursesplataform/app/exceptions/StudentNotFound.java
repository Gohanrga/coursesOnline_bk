package com.coursesplataform.app.exceptions;

public class StudentNotFound extends Exception{

	private static final long serialVersionUID = -5940560926137659436L;

	public static final String DESCRIPTION = "Student not found";
	
	public StudentNotFound() {
		super(DESCRIPTION);
	}
	
	public StudentNotFound(String detail) {
		super(DESCRIPTION + " "+detail);
	}
	
}
