package com.nis.controller;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.nis.model.AttendanceModel;


public class AttendanceController {

public static boolean addNewRecord(AttendanceModel A)
{
	{try{//Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection cn= DBHelper.openConnection();
		String query="insert into attendance(enrollmentno,date,semester,departmentid)values('"+A.getEnrollmentno()+"','"+A.getDate()+"','"+A.getSemester()+"',"+A.getDepartmentid()+")";
	    System.out.println(query);
		boolean st =DBHelper.executeUpdate(cn, query);
	    return(st);
	}catch(Exception e){
		System.out.println("Error:[UC-addNewRecord]:"+e);
	  return(false);
	}
	
}
}
	public static ResultSet DisplayAll()
	{
		try{Connection cn=DBHelper.openConnection();
			String query="select a.studentid,a.semester,a.subjectid,a.departmentid,a.date,a.facultyid from attendance a";
		    ResultSet rs=DBHelper.executeQuery(cn, query);
		    return(rs);
		}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}	
}
}

