package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepartmentView
 */
@WebServlet("/DepartmentView")
public class DepartmentView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentView() {
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
		out.println("<script src=assets/semester.js></script>");
        out.println("<html>");       
		out.println("<form action='DepartmentSubmit' method='post'>");
        out.println("<table>");
        out.println("<caption><b><i>Department Register</i></b></caption>");
        out.println("<tr>");
        out.println("<td><b><i>Department Name:</i></b></td>");
        out.println("<td><input type='text' name='dname'></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td><b><i>Semester :</i></b></td>");
        out.println("<td><select name='sem_id' id='semester'></td>");
        out.println("</tr>");
        out.println("</table>");
	    out.println("<br><br><input type='submit'>&nbsp;&nbsp;&nbsp;<input type='reset'>"); 
	    out.println("</form></html>");
	   out.flush();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
