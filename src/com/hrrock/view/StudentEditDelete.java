package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrrock.controller.StudentController;
import com.hrrock.model.StudentModel;

/**
 * Servlet implementation class StudentEditDelete
 */
@WebServlet("/StudentEditDelete")
public class StudentEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentEditDelete() {
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
				 StudentModel S=new StudentModel();
				 S.setId(Integer.parseInt(request.getParameter("id")));
			     S.setName(request.getParameter("name"));
			     S.setFather_name(request.getParameter("father_name"));
			     S.setDob(request.getParameter("dob"));
			     S.setGender(request.getParameter("gender"));
			     S.setAddress(request.getParameter("address"));
			    if(request.getParameter("state").equals("-State-"))
			    {S.setState(request.getParameter("pstate"));
			     S.setCity(request.getParameter("pcity"));	}
			    else
			    {S.setState(request.getParameter("sstate"));
			     S.setCity(request.getParameter("scity"));}
			    S.setYearofadmission(Integer.parseInt(request.getParameter("yearofadmission")));
			    S.setEnrollmentno(request.getParameter("enrollmentno")); 
			     S.setMobile(request.getParameter("mobile"));
			     S.setEmail(request.getParameter("email"));
			    
				 boolean st=StudentController.editRecord(S);
				 response.sendRedirect("DisplayAllStudents");
			}
			else if(btn.equals("Delete"))
			{
				 boolean st=StudentController.deleteRecord(Integer.parseInt(request.getParameter("id")));
				 response.sendRedirect("DisplayAllStudents");
				
			}				
		}catch(Exception e){
				out.println(e);
			}		
		}

}
