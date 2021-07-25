package com.coursesplataform.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course_payment")
public class CoursePayment  implements Serializable{

	private static final long serialVersionUID = 4660846461212411879L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="id_course")
	private long idCourse;
	@Column(name="id_student")
	private long idStudent;
	@Column(name="id_payment")
	private long idPayment;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(long idCourse) {
		this.idCourse = idCourse;
	}
	public long getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(long idStudent) {
		this.idStudent = idStudent;
	}
	public long getIdPayment() {
		return idPayment;
	}
	public void setIdPayment(long idPayment) {
		this.idPayment = idPayment;
	}
	
	
}
