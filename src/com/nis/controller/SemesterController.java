package com.nis.controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.nis.model.SemesterModel;

public class SemesterController {
	public static boolean addNewRecord(SemesterModel SM)
	{try{Connection cn=DBHelper.openConnection();
	String query="insert into semester(sem_id,sem_name)values('"+SM.getSem_id()+"','"+SM.getSem_name()+"')";
	boolean st=DBHelper.executeUpdate(cn, query);
    return(st);
}catch(Exception e){
	System.out.println("Error:[UC-addNewRecord]:"+e);
  return(false);  
}
	}
	public static ResultSet displayAll()
	{try{Connection cn=DBHelper.openConnection();
		String query="select sm.sem_id,sm.sem_name from semester sm";
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    return(rs);
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	public static SemesterModel displayById(int sem_id)
	{try{Connection cn=DBHelper.openConnection();
		String query="select sm.sem_id,sm.sem_name from semester sm where sm.sem_id="+sem_id;
	    ResultSet rs=DBHelper.executeQuery(cn, query);
	    if(rs.next())
	    {SemesterModel SM=new SemesterModel();
	     SM.setSem_id(Integer.parseInt(rs.getString(1)));	
	     SM.setSem_name(rs.getString(2));
	     return(SM);
	    }
	    return(null);
	     
	}catch(Exception e){
		System.out.println("Error:[UC-displayAll]:"+e);
	  return(null);  
	}}
	
	public static boolean editRecord(SemesterModel SM)
	{try{Connection cn=DBHelper.openConnection();
		String query="update semester set name='"+SM.getSem_name()+"' where sem_id="+SM.getSem_id();
		 
	    boolean st=DBHelper.executeUpdate(cn, query);
	    return(st);
	}catch(Exception e){
		System.out.println("Error:[UC-editRecord]:"+e);
	  return(false);  
	}
		}
	public static boolean deleteRecord(int sem_id)
	{try{Connection cn=DBHelper.openConnection();
		String query="delete from semester where sem_id="+sem_id;
		 
	    boolean st=DBHelper.executeUpdate(cn, query);
	    return(st);
	}catch(Exception e){
		System.out.println("Error:[UC-deleteRecord]:"+e);
	  return(false);  
	}
		}
	}

	
	
	



