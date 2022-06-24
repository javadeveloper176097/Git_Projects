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
    	
    	Student stu = new Student();
    	stu.setStudent_id(1012);
    	
    	StudentDao studao = context.getBean("studentDao",StudentDao.class);
		/*
		 * int z = studao.insert(stu); System.out.println(z + " Record Inserted");
		 */
		/*
		 * stu.setStudent_id(1012); stu.setStudent_name("Manoj Kumar Walia");
		 * stu.setStudent_city("Yokohama");
		 * 
		 * Student stu1 = studao.update(stu);
		 * 
		 * System.out.println(stu+"Record updated");
		 */
    	Student stu2 = studao.delete(stu);
    	
    	System.out.println("Record Deleted");
    }
    
    
    
}
