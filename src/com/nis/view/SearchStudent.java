package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchStudent
 */
@WebServlet("/SearchStudent")
public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchStudent() {
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
		out.println("<script src=assets/jquery-2.2.1.min.js></script>");
		out.println("<script src=assets/searchStudent.js></script>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>Department</td>");
		out.println("<td><select id='dept' ></select></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Semester</td>");
		out.println("<td><select id='sem' >"
				+ "<option>1</option>"
				+ "<option>2</option>"
				+ "<option>3</option>"
				+ "<option>4</option>"
				+ "<option>5</option>"
				+ "<option>6</option>"
				+ "<option>7</option>"
				+ "<option>8</option>"
				+ "</select></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type='button' id='btn' value='Search' ></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<div id='result'></div>");
		out.println("</html>");
	}

}
