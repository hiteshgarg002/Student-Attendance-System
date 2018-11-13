package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubjectView
 */
@WebServlet("/SubjectView")
public class SubjectView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectView() {
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
		
		out.println("<script src=asset/jquery-2.2.1.min.js></script>");
		
		out.println("<form action='SubjectSubmit' method='post' enctype='multipart/form-data'>");
		out.println("<table>");
		out.println("<caption><b><i>Subject Register</i></b></caption>");
		
		out.println("<tr>");
		out.println("<td><b><i>Branch:</i></b></td>");
		out.println("<td><select name='bid' id='bid'><option>-Branch-</option></select></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td><b><i>Branch Name:</i></b></td>");
		out.println("<td><select name='bname' id='bid'><option>-Branch Name-</option></select></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td><b><i>Subject Id:</i></b></td>");
		out.println("<td><select name='sid' id='bid'><option>-Subject Id-</option></select></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td><b><i>Subject Name:</i></b></td>");
		out.println("<td><select name='sname' id='bid'><option>-Subject Name-</option></select></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td><b><i>Semester:</i></b></td>");
		out.println("<td><select name='subjectsemester' id='subjectsemester'><option>-Sem-</option></td>");
		out.println("<tr>");
		
		out.println("</table>");
		out.println("<br><br><input type='submit'>&nbsp&nbsp&nbsp<input type='reset'>");
		out.println("</form></html>");
		out.flush();
	}
}
