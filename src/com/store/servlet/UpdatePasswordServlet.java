package com.store.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.model.User;
import com.store.util.UserDBUtil;

/**
 * Servlet implementation class UpdatePasswordServlet
 */
@WebServlet("/UpdatePasswordServlet")
public class UpdatePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newPass = request.getParameter("p2");
		String uid = request.getParameter("uid");
		String uname = request.getParameter("uname");
		
		boolean isTrue = UserDBUtil.updatePassword(uid, newPass);
		
		try {
			if(isTrue == true) {
				List<User> userDetails = UserDBUtil.getAccount(uname);
				request.setAttribute("userDetails", userDetails);
			
				RequestDispatcher dis = request.getRequestDispatcher("Account.jsp");
				dis.forward(request, response);
			}
			else {
				System.out.println("Updation not Succesfull");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
