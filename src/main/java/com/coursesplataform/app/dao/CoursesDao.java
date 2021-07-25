package com.coursesplataform.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursesplataform.app.entity.Courses;

public interface CoursesDao extends JpaRepository<Courses, Long>{

}
