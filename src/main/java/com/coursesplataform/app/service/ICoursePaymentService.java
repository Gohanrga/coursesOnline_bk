package com.coursesplataform.app.service;

import java.util.List;

import com.coursesplataform.app.entity.CoursePayment;

public interface ICoursePaymentService {
	public CoursePayment insertCoursePayment(CoursePayment coursePayment);
	public List<CoursePayment> getCoursesStudent(long idStudent);
}
