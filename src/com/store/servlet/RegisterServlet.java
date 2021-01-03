package com.store.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.util.UserDBUtil;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		
		boolean userRegs = UserDBUtil.registerUser(name, uname, email, gender, phone, address, password);
		
		try {
			if(userRegs == true) {
				request.setAttribute("userName", uname);
				RequestDispatcher dis = request.getRequestDispatcher("Home.jsp");
				dis.forward(request, response);
			}else {
				request.setAttribute("errorMsg", "Not Succcesfully Registered!");
				RequestDispatcher dis = request.getRequestDispatcher("Register.jsp");
				dis.forward(request, response);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
