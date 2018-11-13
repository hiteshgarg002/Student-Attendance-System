package com.hrrock.controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.hrrock.model.StudentModel;

public class StudentController {
	public static boolean addNewRecord(StudentModel S)
	{try{Connection cn=DBHelper.openConnection();
	String query="insert into student(id,name,father_name,dob,gender,address,city,email,mobile,yearofadmission,enrollmentno,photo,password)values('"+S.getId()+"','"+S.getName()+"','"+S.getFather_name()+"','"+S.getDob()+"','"+S.getGender()+"','"+S.getAddress()+"','"+S.getCity()+"','"+S.getEmail()+"','"+S.getMobile()+"','"+S.getYearofadmission()+"','"+S.getEnrollmentno()+"','"+S.getPhoto()+"','"+S.getPassword()+"')";
	boolean st=DBHelper.executeUpdate(cn, query);
    return(st);
}catch(Exception e){
	System.out.println("Error:[UC-addNewRecord]:"+e);
  return(false);  
}
	}
	public static ResultSet displayAll()
	{try{Connection cn=DBHelper.openConnection();
		String query="select s.id,s.name,s.father_name,s.dob,s.gender,s.address,s.state(select s.statename from states s where s.stateid=s.state) as sstate,s.city,(select c.cityname from city c where c.cityid=s.city) as scity,s.email,s.mobile,s.yearofadmission,s.enrollmentno,s.photo,s.password from student s";
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    return(rs);
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	public static ResultSet displayStudentBySemAndDept(String sem,String dept){
		try{
			Connection cn=DBHelper.openConnection();
			String query = "SELECT * FROM student where departmentid="+dept+" and semester = "+sem;
			ResultSet rs = DBHelper.executeQuery(cn, query);
			return rs;
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
		
	}
	public static StudentModel displayById(int id)
	{try{Connection cn=DBHelper.openConnection();
		String query="select s.id,s.name,s.father_name,s.dob,s.gender,s.address,s.state(select s.statename from states s where s.stateid=s.state) as sstate,s.city,(select c.cityname from city c where c.cityid=s.city) as scity,s.email,s.mobile,s.yearofadmission,s.enrollmentno,s.photo,s.password from student s where s.id="+id;
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    if(rs.next())
	    {StudentModel S=new StudentModel();
	     S.setId(Integer.parseInt(rs.getString(1)));	
	     S.setName(rs.getString(2));
	     S.setFather_name(rs.getString(3));
	     S.setDob(rs.getString(4));
	     S.setGender(rs.getString(5));
	     S.setAddress(rs.getString(6));
	     S.setState(rs.getString(5)+","+rs.getString(6));
	     S.setCity(rs.getString(7)+","+rs.getString(8));
	     S.setEmail(rs.getString(9));
	     S.setMobile(rs.getString(10));
	     S.setYearofadmission(Integer.parseInt(rs.getString(11)));	
	     S.setEnrollmentno(rs.getString(12));
	     S.setPhoto(rs.getString(12));
	     S.setPassword(rs.getString(12));
	     	
	     return(S);
	    }
	    return(null);
	     
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	
	public static boolean editRecord(StudentModel S)
	{try{Connection cn=DBHelper.openConnection();
		String query="update student set name='"+S.getName()+"',father_name='"+S.getFather_name()+"',dob='"+S.getDob()+"',gender='"+S.getGender()+"',address='"+S.getAddress()+"',state='"+S.getState()+"',city='"+S.getCity()+"',email='"+S.getEmail()+"',mobile='"+S.getMobile()+"',yearofadmission='"+S.getYearofadmission()+"',enrollmentno='"+S.getEnrollmentno()+"',photo='"+S.getPhoto()+"',password='"+S.getPassword()+"' where id="+S.getId();
		 
	    boolean st=DBHelper.executeUpdate(cn, query);
	    return(st);
	}catch(Exception e){
		System.out.println("Error:[UC-editRecord]:"+e);
	  return(false);  
	}
		}
	public static boolean deleteRecord(int id)
	{try{Connection cn=DBHelper.openConnection();
		String query="delete from student where id="+id;
		 
	    boolean st=DBHelper.executeUpdate(cn, query);
	    return(st);
	}catch(Exception e){
		System.out.println("Error:[UC-deleteRecord]:"+e);
	  return(false);  
	}
		}
	}

	
	
	



