package com.coursesplataform.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursesplataform.app.entity.Courses;
import com.coursesplataform.app.service.ICoursesService;

@RestController
@RequestMapping("/api")
public class CourseController {
	@Autowired
	private ICoursesService coursesService;
	
	@GetMapping("/getCourses")
	public List<Courses> getCourses(){
		return coursesService.getCourses();
	}
	
	@GetMapping("/getCourse/{id}")
	public ResponseEntity<?> getCourse(@PathVariable Long id){
		Courses courseAux =  coursesService.getCourse(id);
		if(courseAux == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(courseAux);
	}
	
}
