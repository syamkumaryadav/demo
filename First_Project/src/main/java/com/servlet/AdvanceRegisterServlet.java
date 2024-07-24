package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.service.StudentService;

/**
 * Servlet implementation class AdvanceRegisterServlet
 */
@WebServlet("/AdvanceRegisterServlet")
public class AdvanceRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sno = request.getParameter("sno");
        String sname = request.getParameter("sname");
        String sage = request.getParameter("sage");
        String scourse = request.getParameter("scourse");

        System.out.println(sno + " " + sname + " " + sage + " " + scourse);

        Student student = new Student();
        student.setSno(sno);
        student.setSname(sname);
        student.setSage(sage);
        student.setScourse(scourse);

        StudentService studentService = new StudentService();
        studentService.registerStudent(student);

        request.getRequestDispatcher("Success.jsp").forward(request, response);
	}

}
