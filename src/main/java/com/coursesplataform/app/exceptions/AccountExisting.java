package com.coursesplataform.app.exceptions;

public class AccountExisting extends Exception{

	private static final long serialVersionUID = -2729115966278427580L;

	public static final String DESCRIPTION = "Existing Account";
	
	public AccountExisting() {
		super(DESCRIPTION);
	}
	
	public AccountExisting(String detail) {
		super(DESCRIPTION + " "+detail);
	}
	
}
