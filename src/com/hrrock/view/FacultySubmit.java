package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.hrrock.controller.FacultyController;
import com.hrrock.model.FacultyModel;

/**
 * Servlet implementation class FacultySubmit
 */
@WebServlet("/FacultySubmit")
public class FacultySubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultySubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		 FacultyModel F=new FacultyModel();
	     F.setFaculty_name(request.getParameter("facultyname"));
	     F.setDepartment_id(Integer.parseInt(request.getParameter("departmentid")));
	     F.setEmail_id(request.getParameter("emailid"));
	     F.setMobile(request.getParameter("mobile"));
	    // U.setLogo(request.getParameter("ulogo"));
	     Part part=request.getPart("photo");
		    FileUpload Fi=new FileUpload(part,"F:/Eclipse Mars/eclipse/StudentAttendanceSystem/WebContent/images/faculty");
		    F.setPhoto(Fi.filename);
	    
	     
	    boolean st=FacultyController.addNewRecord(F);
	    
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
