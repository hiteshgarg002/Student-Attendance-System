package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrrock.controller.StudentController;
import com.hrrock.model.StudentModel;


/**
 * Servlet implementation class DisplayStudentsById
 */
@WebServlet("/DisplayStudentsById")
public class DisplayStudentsById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayStudentsById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
		StudentModel S=StudentController.displayById(Integer.parseInt(request.getParameter("sid")));
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
        out.println("<script src=asset/statecity.js></script>");
        
        out.println("<html>");
        out.println("<form action='#' method='post' enctype='multipart/form-data'>");
        out.println("<table>");
        out.println("<caption><b><i>Student Register</i></b></caption>");
        out.println("<input type=hidden name=sid  value="+S.getId()+">");
        
        out.println("<tr>");
        out.println("<td><b><i>Student Name:</i></b></td>");
        out.println("<td><input type='text' name='sname' value='"+S.getName()+"'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Father Name:</i></b></td>");
        out.println("<td><input type='text' name='fname' value='"+S.getFather_name()+"'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Date of birth:</i></b></td>");
        out.println("<td><input type='date' name='sdob'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Gender:</i></b></td>");
        out.println("<td><input type='radio' name='sgender'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Address:</i></b></td>");
        out.println("<td><textarea rows='3' cols='30' name='sadd'>"+S.getAddress()+"</textarea></td>");
        out.println("</tr>"); 
        
        String arrayState[]=S.getState().split(",");
        out.println("<tr>");
        out.println("<td><b><i>State:</i></b></td>");
        out.println("<td><select name='sstate' id='sstate'><option>-State-</option></td>");
        out.println("</tr>");
	
        String arrayCity[]=S.getCity().split(",");
        out.println("<tr>");
        out.println("<td><b><i>City:</i></b></td>");
        out.println("<td><select name='scity' id='scity'><option>-City-</option></select></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Email:</i></b></td>");
        out.println("<td><input type='email' name='semail'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Mobile:</i></b></td>");
        out.println("<td><input type='number' name='smobile'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Year of Admission:</i></b></td>");
        out.println("<td><input type='number' name='syearofadmission'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Enrollment No:</i></b></td>");
        out.println("<td><input type='text' name='senrollmentno'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Year of Admission:</i></b></td>");
        out.println("<td><input type='number' name='syearofadmission'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Photo:</i></b></td>");
        out.println("<td><input type='file' name='sphoto'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Password:</i></b></td>");
        out.println("<td><input type='password' name='spassword'></td>");
        out.println("</tr>");
        
        
	 
	
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

