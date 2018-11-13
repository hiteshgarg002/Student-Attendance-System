package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentView
 */
@WebServlet("/StudentView")
public class StudentView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<script src=assets/jquery-2.2.1.min.js></script>");
		out.println("<script src=assets/statecity.js></script>");
        out.println("<html>");       
		out.println("<form action='StudentSubmit' method='post' enctype='multipart/form-data'>");
        out.println("<table>");
        out.println("<caption><b><i>Student Register</i></b></caption>");
        out.println("<tr>");
        out.println("<td><b><i>Student Name:</i></b></td>");
        out.println("<td><input type='text' name='sname'></td>");
        out.println("</tr>");
        out.println("<tr>");
        
        out.println("<td><b><i>Father Name:</i></b></td>");
        out.println("<td><input type='text' name='fname'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Date Of Birth:</i></b></td>");
        out.println("<td><input type='date' name='dob'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Gender:</i></b></td>");
        out.println("<td><input value=male type='radio' name='gender'>Male &emsp;<input value=female type='radio' name='gender'>Female</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Address:</i></b></td>");
        out.println("<td><textarea rows='3' cols='30' name='sadd'></textarea></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>State:</i></b></td>");
        out.println("<td><select name='sstate' id='sstate'><option>-State-</option></td>");
        out.println("</tr>");
	
	
        out.println("<tr>");
        out.println("<td><b><i>City:</i></b></td>");
        out.println("<td><select name='scity' id='scity'`><option>-City-</option></td>");
        out.println("</tr>");
	
        out.println("<tr>");
        out.println("<td><b><i>Email:</i></b></td>");
        out.println("<td><input type='email' name='semail'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Mobile No:</i></b></td>");
        out.println("<td><input type='number' name='snumber'></td>");
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
        out.println("<td><b><i>Photo:</i></b></td>");
        out.println("<td><input type='file' name='sphoto'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Password:</i></b></td>");
        out.println("<td><input type='text' name='spassword'></td>");
        out.println("</tr>");
        
       out.println("</table>");
	    out.println("<br><br><input type='submit'>&nbsp;&nbsp;&nbsp;<input type='reset'>"); 
	    out.println("</form></html>");
	   out.flush();
	}

}
