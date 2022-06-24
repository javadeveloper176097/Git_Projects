package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm_dao.StudentDao;
import com.springorm_entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
    	
    	Student stu = new Student(101,"deepak","meerut");
    	
    	StudentDao studao = context.getBean("studentDao",StudentDao.class);
    	int z = studao.insert(stu);
    	System.out.println(z + " Record Inserted");
    }
}
