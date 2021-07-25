package com.coursesplataform.app.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.coursesplataform.app.entity.CoursePayment;
public interface CoursePaymentDao extends JpaRepository<CoursePayment, Long>{
	@Query("SELECT u FROM CoursePayment u "
			+ "where u.idStudent = :id")
	List<CoursePayment> getCoursesByStudent(@Param("id") Long id);
}
