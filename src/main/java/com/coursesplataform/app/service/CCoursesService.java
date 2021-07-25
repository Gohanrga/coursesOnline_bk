package com.coursesplataform.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursesplataform.app.dao.CoursesDao;
import com.coursesplataform.app.entity.Courses;

@Service
public class CCoursesService implements ICoursesService {

	@Autowired
	private CoursesDao courseDao;
	
	@Override
	public List<Courses> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Courses getCourse(long id) {
		return courseDao.findById(id).orElse(null);
	}

}
