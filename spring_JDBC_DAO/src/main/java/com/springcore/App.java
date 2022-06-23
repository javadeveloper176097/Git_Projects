package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	
 
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Room_Mates rm = new Room_Mates();
    	rm.setFingerPrintId(55011);
    	rm.setName("Manoj Kumar");
    	rm.setAge(25);
    	rm.setMobile("8904809333");
    	rm.setAddress("HPU Shimla");
    	
    	Room_MatesDAO roommates = context.getBean("empimp",Room_MatesDAO.class);
		int w = roommates.addMember(rm);
		System.out.println(w + " Record Inserted");
    	
    }
}
