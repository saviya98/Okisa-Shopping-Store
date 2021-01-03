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
 * Servlet implementation class UpdateAccountServlet
 */
@WebServlet("/UpdateAccountServlet")
public class UpdateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String uname = request.getParameter("uname");
		String name = request.getParameter("upname");
		String email = request.getParameter("upemail");
		String phone = request.getParameter("upphone");
		String address = request.getParameter("upaddress");
		
		boolean isTrue;
		
		isTrue = UserDBUtil.updateAccount(uname, name, email, phone, address);
		System.out.println(uname);
		
		
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
