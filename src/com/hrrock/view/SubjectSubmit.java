package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrrock.controller.SubjectController;
import com.hrrock.model.SubjectModel;

/**
 * Servlet implementation class SubjectSubmit
 */
@WebServlet("/SubjectSubmit")
public class SubjectSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		SubjectModel S=new SubjectModel();
		S.setBranch_id(request.getParameter("branch_id"));
		S.setBranch_name(request.getParameter("branch_name"));
		S.setSubject_id(Integer.parseInt(request.getParameter("subject_id")));
		
		S.setSubject_name(request.getParameter("subject_name"));
		S.setSemester(request.getParameter("semester"));
		
		boolean st=SubjectController.addNewRecord(S);
		out.println("<html>");
		if(st)
		{
			out.println("Record Submitted...");
		}
		else
		{
			out.println("Fail to Submit Record...");
		}
		out.println("</html>");
		out.flush();
	}

}
