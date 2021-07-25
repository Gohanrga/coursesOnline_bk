package com.coursesplataform.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursesplataform.app.dao.StudentsDao;
import com.coursesplataform.app.entity.Students;
import com.coursesplataform.app.exceptions.StudentNotFound;

@Service
public class CStudentsService implements IStudentsService{

	@Autowired
	private StudentsDao studentsDao;

	@Override
	public Students getStudent(Long id) {
		return studentsDao.findById(id).orElse(null);
	}
	
	@Override
	public Students insertStudent(Students student) {
		return studentsDao.save(student);
	}

	@Override
	public Students updateStudent(Students student) throws StudentNotFound {
		Optional<Students> optionalStudent = studentsDao.findById(student.getId());
		if(!optionalStudent.isPresent())
			throw new StudentNotFound();
		
		Students studentAux = optionalStudent.get();
		studentAux.setDateBirth(student.getDateBirth());
		studentAux.setGender(student.getGender());
		studentAux.setAddress(student.getAddress());
		studentAux.setPhoneNumber(student.getPhoneNumber());
		studentAux.setPreferredLanguage(student.getPreferredLanguage());
		studentAux.setEducationLevel(student.getEducationLevel());
		
		return studentsDao.save(studentAux);
		
	}

	@Override
	public Students getStudentByEmail(String email) {
		return studentsDao.getStudentByEmail(email);
	}
	
	
}
