package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hrrock.model.FacultyModel;

/**
 * Servlet implementation class FacultyHome
 */
@WebServlet("/FacultyHome")
public class FacultyHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<script src=jquery-2.2.1.min.js></script>");
		out.println("<script src=branchsubject.js></script>");
		out.println("<html>");
		HttpSession ses=request.getSession();
		
		try{
			FacultyModel A=(FacultyModel)ses.getValue("SFACULTY");
			String ltime=ses.getValue("LTIME").toString();
			String sn="<b>Id:"+A.getFaculty_id()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+A.getFaculty_name()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ltime+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=FacultyLogut>Logout</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=images/faculty/"+A.getPhoto()+" width=25 height=25></b><br><hr color=red>";	
			out.println(sn);	
		}catch(Exception e){
			response.sendRedirect("FacultyLogin");		
		}
		
		out.println("<table>");
		out.println("<tr><td><select id=ubranch>-Branch-</select></td>");
		out.println("<td><select id=usemester>-Semester-</select></td>");
		out.println("<td><select id=usubject>-Subject-</select></td></tr>");
        out.println("</table></html>");
		
	}

}
