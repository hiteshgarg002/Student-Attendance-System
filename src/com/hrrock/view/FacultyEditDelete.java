package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrrock.controller.FacultyController;
import com.hrrock.controller.StudentController;
import com.hrrock.model.FacultyModel;
import com.hrrock.model.StudentModel;

/**
 * Servlet implementation class FacultyEditDelete
 */
@WebServlet("/FacultyEditDelete")
public class FacultyEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyEditDelete() {
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
			String btn=request.getParameter("btn");
			if(btn.equals("Edit"))
			{
				 FacultyModel F=new FacultyModel();
				 F.setFaculty_id(Integer.parseInt(request.getParameter("faculty_id")));
			     F.setFaculty_name(request.getParameter("faculty_name"));
			     F.setDepartment_id(Integer.parseInt(request.getParameter("department_id")));
			     F.setMobile(request.getParameter("mobile"));
			     F.setEmail_id(request.getParameter("email_id"));
			    
				 boolean st=FacultyController.editRecord(F);
				 response.sendRedirect("DisplayAllFaculties");
			}
			else if(btn.equals("Delete"))
			{
				 boolean st=FacultyController.deleteRecord(Integer.parseInt(request.getParameter("faculty_id")));
				 response.sendRedirect("DisplayAllFaculties");
				
			}				
		}catch(Exception e){
				out.println(e);
			}	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		