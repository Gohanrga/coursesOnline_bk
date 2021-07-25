package com.coursesplataform.app.service;
import com.coursesplataform.app.entity.Students;
import com.coursesplataform.app.exceptions.StudentNotFound;
public interface IStudentsService {
	public Students getStudent(Long id);
	public Students getStudentByEmail(String email);
	public Students insertStudent(Students student);
	public Students updateStudent(Students student) throws StudentNotFound;
}
