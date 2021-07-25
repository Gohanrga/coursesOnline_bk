package com.coursesplataform.app.service;

import com.coursesplataform.app.entity.Students;
import com.coursesplataform.app.entity.Users;
import com.coursesplataform.app.exceptions.AccountExisting;

public interface IUsersService {
	public Users loginUser(Users user) ;
	public Users insertUser(Users user) throws AccountExisting;
}
