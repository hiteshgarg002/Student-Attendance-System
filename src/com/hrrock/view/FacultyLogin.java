package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FacultyLogin
 */
@WebServlet("/FacultyLogin")
public class FacultyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<form action=checkfacultylogin method=post>"
				+ "<table>"
				+ "<tr><input type='text' name='facultyid' placeholder='Enter Faculty lgoin' /></tr>"
				+ "<tr><input type='password' name='password' placeholder='Enter Faculty password' /></tr>"
				+ "<tr><button type='submit'>Login</button></tr>"
				+ "</table>"
				+ "</form>"
				+ "</html>");
	}
	

}
