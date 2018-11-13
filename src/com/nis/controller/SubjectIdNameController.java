package com.nis.controller;

import java.sql.Connection;
import java.sql.ResultSet;

public class SubjectIdNameController {
	static public ResultSet getAllId()
	{ try{
		Connection cn=DBHelper.openConnection();
	String query="Select * from sid";
	ResultSet rs=DBHelper.executeQuery(cn, query);
	return(rs);
		
	}catch(Exception e)
	{System.out.println("SubjectIdName Controller "+e);}
		return(null);
	}
	static public ResultSet getAllSubjectNames(String subjectid)
	{ try{
		Connection cn=DBHelper.openConnection();
	String query="Select * from names where Subjectid='"+subjectid+"'";
	ResultSet rs=DBHelper.executeQuery(cn, query);
	return(rs);
		
	}catch(Exception e)
	{System.out.println("SubjectIdName Controller "+e);}
		return(null);
	}
}
