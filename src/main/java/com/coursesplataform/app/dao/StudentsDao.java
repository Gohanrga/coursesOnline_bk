package com.coursesplataform.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.coursesplataform.app.entity.Students;

public interface StudentsDao extends JpaRepository<Students, Long> {
	@Query("SELECT u FROM Students u "
			+ "where u.email = :email")
	Students getStudentByEmail(@Param("email") String email);
}
