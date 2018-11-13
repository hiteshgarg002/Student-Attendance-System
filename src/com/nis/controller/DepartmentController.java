package com.nis.controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.nis.model.DepartmentModel;

public class DepartmentController {
	public static boolean addNewRecord(DepartmentModel D)
	{try{Connection cn=DBHelper.openConnection();
	String query="insert into department(department_name,semester_id)values('"+D.getDepartment_name()+"','"+D.getSem_id()+"')";
	boolean st=DBHelper.executeUpdate(cn, query);
    return(st);
}catch(Exception e){
	System.out.println("Error:[UC-addNewRecord]:"+e);
  return(false);  
	}
}
	public static ResultSet displayAll()
	{try{Connection cn=DBHelper.openConnection();
		String query="select department_id,department_name from department";
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    return(rs);
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	
	public static DepartmentModel displayById(int department_id)
	{try{Connection cn=DBHelper.openConnection();
		String query="select d.department_id,d.department_name,d.sem_id from department d where d.department_id="+department_id;
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    if(rs.next())
	    {DepartmentModel D=new DepartmentModel();
	     D.setDepartment_id(Integer.parseInt(rs.getString(1)));	
	     D.setDepartment_name(rs.getString(2));
	     D.setSem_id(Integer.parseInt(rs.getString(3)));
	     return(D);
	    }
	    return(null);
	     
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	
	public static boolean editRecord(DepartmentModel D)
	{try{Connection cn=DBHelper.openConnection();
		String query="update department set name='"+D.getDepartment_name()+"',sem_id='"+D.getSem_id()+"' where id="+D.getDepartment_id();
		 
	    boolean st=DBHelper.executeUpdate(cn, query);
	    return(st);
	}catch(Exception e){
		System.out.println("Error:[UC-editRecord]:"+e);
	  return(false);  
	}
		}
	public static boolean deleteRecord(int department_id)
	{try{Connection cn=DBHelper.openConnection();
		String query="delete from department where department_id="+department_id;
		 
	    boolean st=DBHelper.executeUpdate(cn, query);
	    return(st);
	}catch(Exception e){
		System.out.println("Error:[UC-deleteRecord]:"+e);
	  return(false);  
	}
		}
	}

	
	
	



