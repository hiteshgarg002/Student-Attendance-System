package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FacultyView
 */
@WebServlet("/FacultyView")
public class FacultyView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyView() {
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
        out.println("<html>");       
		out.println("<form action='FacultySubmit' method='post' enctype='multipart/form-data'>");
        out.println("<table>");
        out.println("<caption><b><i>Faculty Register</i></b></caption>");
        out.println("<tr>");
        out.println("<td><b><i>Faculty Name:</i></b></td>");
        out.println("<td><input type='text' name='fname'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Department Id:</i></b></td>");
        out.println("<td><select name='fdepartment_id' id='fdepartment_id'><option>-Department Id-</option></td>");
        out.println("</tr>");
        
        
        out.println("<tr>");
        out.println("<td><b><i>Email:</i></b></td>");
        out.println("<td><input type='email' name='femail'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Mobile No:</i></b></td>");
        out.println("<td><input type='number' name='fnumber'></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Photo:</i></b></td>");
        out.println("<td><input type='file' name='fphoto'></td>");
        out.println("</tr>");
        
        out.println("</table>");
	    out.println("<br><br><input type='submit'>&nbsp;&nbsp;&nbsp;<input type='reset'>"); 
	    out.println("</form></html>");
	   out.flush();
        
        
	}

}
