package com.coursesplataform.app.service;
import java.util.List;

import com.coursesplataform.app.entity.Courses;

public interface ICoursesService {
	public List<Courses> getCourses();
	public Courses getCourse(long id);
}
