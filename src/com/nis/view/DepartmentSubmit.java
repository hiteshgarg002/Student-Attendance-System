package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.nis.controller.DepartmentController;
import com.nis.controller.FacultyController;
import com.nis.model.DepartmentModel;
import com.nis.model.FacultyModel;

/**
 * Servlet implementation class DepartmentSubmit
 */
@WebServlet("/DepartmentSubmit")
public class DepartmentSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		 DepartmentModel D=new DepartmentModel();
	     D.setDepartment_name(request.getParameter("departmentname"));
	     D.setDepartment_id(Integer.parseInt(request.getParameter("departmentid")));	
	     D.setSem_id(Integer.parseInt(request.getParameter("semesterid")));
	    
	     
	    boolean st=DepartmentController.addNewRecord(D);
	    
	    out.println("<html>");
	    if(st)
	    {out.println("Record Submitted...");
	     }
	    else
	    {out.println("Fail to Submit Record...");
	    	
	    }
	  out.println("</html>");
	  out.flush();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
