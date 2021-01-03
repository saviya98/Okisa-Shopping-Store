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
 * Servlet implementation class DeleteAccountServlet
 */
@WebServlet("/DeleteAccountServlet")
public class DeleteAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid = request.getParameter("uid");
		
		boolean isTrue;
		
		isTrue = UserDBUtil.deleteAccount(uid);
		
		
		try {
			if(isTrue == true) {
			
				RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
				dis.forward(request, response);
			}
			else {
				System.out.println(" not Succesfull");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
