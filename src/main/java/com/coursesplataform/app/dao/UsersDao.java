package com.coursesplataform.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coursesplataform.app.entity.Users;; 

@Repository
public interface UsersDao extends JpaRepository<Users, Long>{
	@Query("SELECT u FROM Users u "
			+ "where u.email = :email and "
			+ "u.password = :password ")
	Users login(@Param("email") String email, @Param("password")String password );
	
	@Query("SELECT u FROM Users u "
			+ "where u.email = :email")
	Users getUserByEmail(@Param("email") String email);
}
