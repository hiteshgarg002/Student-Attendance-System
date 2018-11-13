package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.softech.FileUpload;

import com.hrrock.controller.StudentController;
import com.hrrock.model.StudentModel;

/**
 * Servlet implementation class UniversitySubmit
 */
@WebServlet("/StudentSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class StudentSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		 StudentModel S=new StudentModel();
	     S.setName(request.getParameter("name"));
	     S.setFather_name(request.getParameter("father_name"));
	     S.setDob(request.getParameter("dob"));
	     S.setAddress(request.getParameter("address"));
	     S.setState(request.getParameter("state"));
	     S.setCity(request.getParameter("city"));
	     S.setEmail(request.getParameter("email"));
	     S.setMobile(request.getParameter("mobile"));
	     S.setYearofadmission(Integer.parseInt(request.getParameter("yearofadmission")));
	     S.setEnrollmentno(request.getParameter("enrollmentno"));
	     S.setPhoto(request.getParameter("photo"));
         S.setPassword(request.getParameter("password"));
	    // S.setLogo(request.getParameter("logo"));
	     Part P=request.getPart("photo");
		    FileUpload F=new FileUpload(P,"F:/Eclipse Mars/eclipse/StudentAttendanceSystem/WebContent/images/student");
		    S.setPhoto(F.filename);
	    
	     
	    boolean st=StudentController.addNewRecord(S);
	    
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
