package com.coursesplataform.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coursesplataform.app.service.IStudentsService;
import com.coursesplataform.app.service.IUsersService;
import com.coursesplataform.app.entity.Users;
import com.coursesplataform.app.exceptions.AccountExisting;
import com.coursesplataform.app.entity.Students;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	public IUsersService usersService;
	
	@Autowired
	public IStudentsService studentService;
	
	@RequestMapping(method=RequestMethod.POST, value="/insertUser")
	public ResponseEntity<?> insertUser(@RequestBody Users user) throws AccountExisting {
		return ResponseEntity.status(HttpStatus.CREATED).body(usersService.insertUser(user));
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/login")
	public ResponseEntity<?> loginUser(@RequestBody Users user) {
		Users userAux = usersService.loginUser(user);
		if(userAux == null)
			return ResponseEntity.notFound().build();
		Students student = studentService.getStudentByEmail(userAux.getEmail());
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(student);
	}
}
