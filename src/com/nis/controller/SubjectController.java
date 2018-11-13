package com.nis.controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.nis.model.SubjectModel;

public class SubjectController {
	public static boolean addNewRecord(SubjectModel S)
	{
		try{
			Connection cn=DBHelper.openConnection();
			String query="insert into subject(branch_id,branch_name,subject_id,subject_name,semester)values('"+S.getBranch_id()+"','"+S.getBranch_name()+"','"+S.getSubject_id()+"','"+S.getSubject_name()+",'"+S.getSubject_name()+"')";
			boolean st=DBHelper.executeUpdate(cn, query);
			return(st);
			
		}catch(Exception e)
		{System.out.println("Error:[SC-addNewRecord]:"+e);
		return(false);
		}
		
	}
	
	public static ResultSet displaySubjectByBranchid(String branchid) {
		try
		{	Connection cn=DBHelper.openConnection();
			String query="select * from subject s, department d where s.branchid = d.department_id";
			ResultSet rs=DBHelper.executeQuery(cn, query);
			return rs;
		}
		catch(Exception e)
		{
			System.out.println("Error:[Display all semester ]: "+ e);
			return(null);
		}
	}
	public static ResultSet displayAll()
	{
		try{
			Connection cn=DBHelper.openConnection();
			String query="Select s.branch_id,(select b.branch_name from branch b where b.branch_id=s.branch_id) as branch_id,s.subject_id,s.subject_name,s.semester from subject s";
			ResultSet rs=DBHelper.executeQuery(cn, query);
			return(rs);
		}
		catch(Exception e)
		{
			System.out.println("Error:[SC-displayAll]:"+e);
			return(null);
		}
	}
	public static SubjectModel displayById(int subject_id)
	{try
	{Connection cn=DBHelper.openConnection();
	String query="Select s.branch_id,(select b.branch_name from branch b where b.branch_id=s.branch_id) as branch_id,s.subject_id,s.subject_name,s.semester from subject s where s.subject_id="+subject_id;
	ResultSet rs=DBHelper.executeQuery(cn, query);
	if(rs.next())
	{
		SubjectModel S=new SubjectModel();
		S.setBranch_id(rs.getString(1)+","+rs.getString(2));
		S.setBranch_name(rs.getString(1)+","+rs.getString(2));
		S.setSubject_id(Integer.parseInt(rs.getString(3)));
		S.setSubject_name(rs.getString(4));
		S.setSemester(rs.getString(5));
				return(S);
		
		
	}
	return(null);
	}
	catch(Exception e)
	{
		System.out.println("Error:[SC-display]:"+e);
		return(null);
	}
		
	}
	public static boolean editRecord(SubjectModel S)
	{
		try{
			Connection cn=DBHelper.openConnection();
			String query="update subject set branch_id='"+S.getBranch_id()+"',branch_name='"+S.getBranch_name()+"',subject_name='"+S.getSubject_name()+"',semester='"+S.getSemester()+"' where subject_id="+S.getSubject_id();
			System.out.println(query);
			boolean st=DBHelper.executeUpdate(cn, query);
			return(st);
		}
		catch(Exception e)
		{
			System.out.println("Error[SC-editRecord]:"+e);
			return(false);
		}
	}
		public static boolean deleteRecord(int subject_id)
		{
			try{
				Connection cn=DBHelper.openConnection();
				String query="delete from subject where subject_id="+subject_id;
				boolean st=DBHelper.executeUpdate(cn, query);
				return(st);
				
			}
			catch(Exception e)
			{
				System.out.println("Error[SC-deleteRecord]:"+e);
				return(false);
			}
		
	}
	

}
