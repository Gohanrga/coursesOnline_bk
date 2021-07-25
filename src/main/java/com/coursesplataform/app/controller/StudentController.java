package com.coursesplataform.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coursesplataform.app.service.IStudentsService;
import com.coursesplataform.app.entity.Students;
import com.coursesplataform.app.exceptions.StudentNotFound;
@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private IStudentsService studentService;
	
	@GetMapping("/getStudent/{id}")
	private ResponseEntity<?> getStudent(@PathVariable Long id){
		Students studentAux = studentService.getStudent(id);
		if(studentAux == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentAux);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/insertStudent")
	private ResponseEntity<?> insertStudent(@RequestBody Students student){
		return ResponseEntity.status(HttpStatus.CREATED).body(studentService.insertStudent(student));
	}
	
	@PutMapping("/updateStudent")
	private ResponseEntity<?> updateStudent(@RequestBody Students student) throws StudentNotFound{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentService.updateStudent(student));
	}
}
