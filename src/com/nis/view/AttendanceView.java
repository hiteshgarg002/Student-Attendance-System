package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttendanceView
 */
@WebServlet("/AttendanceView")
public class AttendanceView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttendanceView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");       
		out.println("<form action='AttendanceSubmit'method='post' enctype='multipart/form-data'>");
        out.println("<table>");
        out.println("<caption><b><i>Student Register</i></b></caption>");
       
        out.println("<tr>");
        out.println("<td><b><i>Department Id:</i></b></td>");
        out.println("<td><<select name='did' id='did'><option>-DepartmentId-</option>></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Subject Id:</i></b></td>");
        out.println("<td><select name='sid' id='sid'><option>-SubjectId-</option></td>");
        out.println("</tr>");
	
        out.println("<tr>");
        out.println("<td><b><i>Subject Name:</i></b></td>");
        out.println("<td><select name='sn' id='sn'><option>-SubjectName-</option></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Semester:</i></b></td>");
        out.println("<td><select name='sem' id='sem'><option>-Semester-</option></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>SubjectType:</i></b></td>");
        out.println("<td><select name='st' id='st'><option>-SubjectType-</option></td>");
        out.println("</tr>");
	
	
       
	
	    out.println("</table>");
	    out.println("<br><br><input type='submit'>&nbsp;&nbsp;&nbsp;<input type='reset'>"); 
	    out.println("</form></html>");
	    out.flush();
	}

}
