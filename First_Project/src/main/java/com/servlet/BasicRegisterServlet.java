package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasicRegisterServlet
 */
@WebServlet("/BasicRegisterServlet")
public class BasicRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			String sno = request.getParameter("sno");
	        String sname = request.getParameter("sname");
	        
	        request.setAttribute("sno", sno);
	        request.setAttribute("sname", sname);
	        
	        request.getRequestDispatcher("Register2.jsp").forward(request, response);
	}

}
