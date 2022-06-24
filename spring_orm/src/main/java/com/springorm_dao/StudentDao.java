package com.springorm_dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springorm_entities.Student;

public class StudentDao 
{
	private HibernateTemplate hibertemp;
	
	@Transactional
	public int insert(Student student)
	{
		Integer z = (Integer)hibertemp.save(student);
		return z;
	}
	
	@Transactional
	public Student update(Student student)
	{
	
		hibertemp.saveOrUpdate(student);
		return student;
		
	}
	
	@Transactional
	public Student delete(Student student)
	{
		hibertemp.delete(student);
		return student;
	}
	
	public HibernateTemplate getHibertemp() {
		return hibertemp;
	}

	public void setHibertemp(HibernateTemplate hibertemp) {
		this.hibertemp = hibertemp;
	}
	
	
}
