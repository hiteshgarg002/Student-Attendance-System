package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nis.controller.FacultyController;
import com.nis.model.FacultyModel;

/**
 * Servlet implementation class Checkfacultylogin
 */
@WebServlet("/Checkfacultylogin")
public class Checkfacultylogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkfacultylogin() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
		FacultyModel F=FacultyController.checkLogin(request.getParameter("aid"), request.getParameter("pwd"));
		if(F!=null)
		{HttpSession ses=request.getSession();
		  ses.putValue("SFACULTY",F);
		  ses.putValue("LTIME",new java.util.Date().toString());
		 response.sendRedirect("FacultyHome");	
		}
		else
		{out.println("<html><font color=red><b>Invalid FacultyId/Password</b></font></html>");
			
		}
			
		}catch(Exception e){out.println(e);}
	
	}

}
