package com.coursesplataform.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coursesplataform.app.dao.UsersDao;
import com.coursesplataform.app.entity.Users;
import java.util.Optional;
import com.coursesplataform.app.util.Util;
import com.coursesplataform.app.exceptions.AccountExisting;
import com.coursesplataform.app.entity.*;

@Service
public class CUserService implements IUsersService{
	
	@Autowired
	private UsersDao usersDao;

	@Override
	public Users loginUser(Users user)  {
		String password = Util.getMD5(user.getPassword());
		return usersDao.login(user.getEmail(), password);
	}

	@Override
	public Users insertUser(Users user)throws AccountExisting {
		Users userAux =  usersDao.getUserByEmail(user.getEmail());
		if(userAux!= null)
			throw new AccountExisting();
			
		user.setPassword(Util.getMD5(user.getPassword()));
		return usersDao.save(user);
	}
	
}
