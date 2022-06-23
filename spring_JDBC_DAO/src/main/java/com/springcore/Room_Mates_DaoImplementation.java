package com.springcore;

import org.springframework.jdbc.core.JdbcTemplate;

public class Room_Mates_DaoImplementation implements Room_MatesDAO
{

	
	private JdbcTemplate template;
	
	
	public int addMember(Room_Mates rm) {
		

		String query = "insert into roommates values (?,?,?,?,?)";
		int z = template.update(query, rm.getFingerPrintId(), rm.getName(), rm.getAddress(),rm.getAge(),rm.getMobile());
		return z;
	}
	
	public JdbcTemplate getTemplate() 
	{
		return template;
	}

	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}

}
