package com.hrrock.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrrock.controller.AttendanceController;
import com.hrrock.model.AttendanceModel;

/**
 * Servlet implementation class MarkAttendance
 */
@WebServlet("/MarkAttendance")
public class MarkAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarkAttendance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		boolean st=false;
		String eno[]= request.getParameterValues("eno");
		String dept[] = request.getParameterValues("dept");
		String sem[] = request.getParameterValues("sem");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a ");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		String cdate=dateFormat.format(date);
		for(int i=0;i<eno.length;i++){
			AttendanceModel A =new AttendanceModel();
			A.setDate(cdate);
		    A.setEnrollmentno(eno[i]);
		    A.setDepartmentid(Integer.parseInt(dept[i]));
			A.setSemester(sem[i]);
		    st = AttendanceController.addNewRecord(A);
		    
		}
		if(st){
			out.println("Attendance Marked.....");
		}
		else {
			out.println("Attendance Failed.....");
		}
		
	}

}
