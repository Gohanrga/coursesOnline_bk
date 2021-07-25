package com.coursesplataform.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursesplataform.app.dao.CoursePaymentDao;
import com.coursesplataform.app.entity.CoursePayment;

@Service
public class CCoursePayment implements ICoursePaymentService{
	@Autowired
	private CoursePaymentDao coursePaymentDao;

	@Override
	public CoursePayment insertCoursePayment(CoursePayment coursePayment) {
		return coursePaymentDao.save(coursePayment);
	}

	@Override
	public List<CoursePayment> getCoursesStudent(long idStudent) {
		return coursePaymentDao.getCoursesByStudent(idStudent);
	}
	
	
}
