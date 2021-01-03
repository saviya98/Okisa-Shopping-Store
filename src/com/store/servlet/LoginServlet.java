package com.store.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import com.store.model.User;
import com.store.util.UserDBUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
	    String password = request.getParameter("pass");
	    
	    User user = new User();
	    
	    user.setUserName(userName);
	    user.setPassword(password);
	    
	    UserDBUtil reg = new UserDBUtil();
	    
	    String userValidate = reg.validateUser(user);
	    request.setAttribute("uname", userName);
	    
	    
	    if(userValidate.equals("SUCCESS")) {
	    	request.setAttribute("userName", userName);
	    	HttpSession session = request.getSession();
	    	session.setAttribute("userName",userName);
	    	request.getRequestDispatcher("Home.jsp").forward(request, response);
	    }
	    else {
	    	request.setAttribute("errorMsg", userValidate);
	    	request.getRequestDispatcher("Login.jsp").forward(request, response);
	    	System.out.println("noooooo");
		}
	}

}
