package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nis.controller.DepartmentController;
import com.nis.controller.FacultyController;
import com.nis.model.DepartmentModel;
import com.nis.model.FacultyModel;

/**
 * Servlet implementation class DepartmentEditDelete
 */
@WebServlet("/DepartmentEditDelete")
public class DepartmentEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentEditDelete() {
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
			 DepartmentModel D=new DepartmentModel();
			 D.setDepartment_id(Integer.parseInt(request.getParameter("department_id")));
		     D.setDepartment_name(request.getParameter("department_name"));
		     D.setSem_id(Integer.parseInt(request.getParameter("sem_id")));
		    
			 boolean st=DepartmentController.editRecord(D);
			 response.sendRedirect("DisplayAllDepartments");
		}
		else if(btn.equals("Delete"))
		{
			 boolean st=DepartmentController.deleteRecord(Integer.parseInt(request.getParameter("department_id")));
			 response.sendRedirect("DisplayAllDepartments");
			
		}				
	}catch(Exception e){
			out.println(e);
	}
	}
}