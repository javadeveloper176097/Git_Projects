package com.springorm_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_orm1")
public class Student 
{
	@Id
	@Column(name="stu_id")
	private int student_id;
	
	@Column(name="stu_name")
	private String student_name;
	
	@Column(name="stu_city")
	private String student_city;
	
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_id, String student_name, String student_city) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_city = student_city;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_city() {
		return student_city;
	}

	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}
}
