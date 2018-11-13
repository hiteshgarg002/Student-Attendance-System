package com.nis.controller;

import java.sql.Connection;
import java.sql.ResultSet;

import org.softech.FileUpload;
import com.nis.model.FacultyModel;

public class FacultyController {
	public static boolean addNewRecord(FacultyModel F)
	{try{Connection cn=DBHelper.openConnection();
	String query="insert into faculty(faculty_id,faculty_name,department_id,email_id,mobile,photo)values('"+F.getFaculty_id()+"','"+F.getFaculty_name()+"','"+F.getDepartment_id()+"','"+F.getEmail_id()+"','"+F.getMobile()+"','"+F.getPhoto()+"')";
	boolean st=DBHelper.executeUpdate(cn, query);
    return(st);
}catch(Exception e){
	System.out.println("Error:[UC-addNewRecord]:"+e);
  return(false);  
}
	}
	public static ResultSet displayAll()
	{try{Connection cn=DBHelper.openConnection();
		String query="select f.faculty_id,f.faculty_name,f.department_id,f.email_id,f.mobile,f.photo from faculty f";
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    return(rs);
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	public static FacultyModel displayById(int faculty_id)
	{try{Connection cn=DBHelper.openConnection();
		String query="select f.faculty_id,f.faculty_name,f.department_id,f.email_id,f.mobile,f.photo from faculty f where f.faculty_id="+faculty_id;
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    if(rs.next())
	    {FacultyModel F=new FacultyModel();
	     F.setFaculty_id(Integer.parseInt(rs.getString(1)));	
	     F.setFaculty_name(rs.getString(2));
	     F.setDepartment_id(Integer.parseInt(rs.getString(3)));	
	     F.setEmail_id(rs.getString(4));
	     F.setMobile(rs.getString(5));
	     F.setPhoto(rs.getString(6));
	     return(F);
	    }
	    return(null);
	     
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	
	public static boolean editRecord(FacultyModel F)
	{try{Connection cn=DBHelper.openConnection();
		String query="update faculty set name='"+F.getFaculty_name()+"',departmentid='"+F.getDepartment_id()+"',emailid='"+F.getEmail_id()+"',mobile='"+F.getMobile()+"',photo='"+F.getPhoto()+"' where id="+F.getFaculty_id();
		 
	    boolean st=DBHelper.executeUpdate(cn, query);
	    return(st);
	}catch(Exception e){
		System.out.println("Error:[UC-editRecord]:"+e);
	  return(false);  
	}
		}
	public static boolean deleteRecord(int id)
	{try{Connection cn=DBHelper.openConnection();
		String query="delete from faculty where faculty_id="+id;
		 
	    boolean st=DBHelper.executeUpdate(cn, query);
	    return(st);
	}catch(Exception e){
		System.out.println("Error:[UC-deleteRecord]:"+e);
	  return(false);  
	}
		}
	public static FacultyModel checkLogin(String aid,String pwd)
	{try{Connection cn=DBHelper.openConnection();
		String query="select * from admin where adminid='"+aid+"' and password='"+pwd+"'";
	    ResultSet rs=DBHelper.executeQuery(cn, query);
        if(rs.next()){
        FacultyModel A=new FacultyModel();
        A.setFaculty_id((Integer.parseInt(rs.getString(1))));
        A.setFaculty_name(rs.getString(2));
        A.setPhoto(rs.getString(3));
        return(A);
        
        }
        else
        {return null;}

	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}

	
	public static ResultSet getAllBranch()
	{try{Connection cn=DBHelper.openConnection();
		String query="select * from branch";
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    return(rs);
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	public static ResultSet getAllSubjectByBranch(String branchid)
	{try{Connection cn=DBHelper.openConnection();
		String query="select * from subject where branchid="+branchid;
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    return(rs);
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	

}

	
	
	



