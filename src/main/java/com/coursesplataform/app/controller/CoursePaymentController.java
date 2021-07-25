package com.coursesplataform.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coursesplataform.app.entity.CoursePayment;
import com.coursesplataform.app.service.ICoursePaymentService;

@RestController
@RequestMapping("/api")
public class CoursePaymentController {
	@Autowired
	private ICoursePaymentService coursePaymentService;
	
	@RequestMapping(method=RequestMethod.POST, value="/insertCoursePayment")
	public ResponseEntity<?> insertCoursePayment(@RequestBody CoursePayment coursePayment){
		return ResponseEntity.status(HttpStatus.CREATED).body(coursePaymentService.insertCoursePayment(coursePayment));
	}
	
	@GetMapping("/getCoursePayment/{id}")
	public List<CoursePayment> getCoursesStudent(@PathVariable Long id){
		return  coursePaymentService.getCoursesStudent(id);
	}
}
