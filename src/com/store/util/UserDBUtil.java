package com.store.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.store.util.DBConnection;
import com.store.model.User;

public class UserDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	/*public static String validate(User user){
		
		String un = user.getUserName();
		String pw = user.getPassword();
		
		String unDB = "";
		String pwDB = "";
		String roleDB = "";
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String query = "select userName,password,role from userdetails where userName='"+un+"' and password='"+pw+"'";
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				unDB = rs.getString("userName");
				pwDB = rs.getString("password");
				roleDB = rs.getString("role");
				System.out.println(roleDB);
				System.out.println(pwDB);
				System.out.println(pw);
				
				if(un.equals(unDB) && pw.equals(pwDB) && roleDB.equals("admin")) {
					System.out.println("admin not");
					return "admin_role";
				}
				else {
					System.out.println("cus not");
					return "customer_role";
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "Invalid User Credentials";
		
	}*/public String validateUser(User user) {
		
		String userName = user.getUserName();
		String password = user.getPassword();
		
		String userNameDB = "";
		String passwordDB = "";
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select userName, password, role from userdetails");
			
			while(rs.next()) {
				userNameDB = rs.getString("userName");
				passwordDB = rs.getString("password");
				
				if(userName.equals(userNameDB) && password.equals(passwordDB)) {
					return "SUCCESS";
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "Invalid Credentials";
	}
	
	public static boolean registerUser(String name,String uname,String email,String gender,String phone,String address,String password) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String query = "insert into userdetails values(0,'"+name+"','"+uname+"','"+email+"','"+gender+"','"+phone+"','"+address+"','"+password+"',null)";
			int i = stmt.executeUpdate(query);
			
			if (i != 0) {
				 isSuccess = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static List<User> getAccount(String uname){
		
		ArrayList<User> user = new ArrayList<User>();
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String query = "select * from userdetails where userName='"+uname+"' ";
			rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				int uid = rs.getInt(1);
				String name = rs.getString(2);
				String usname = rs.getString(3);
				String email = rs.getString(4);
				String gender = rs.getString(5);
				String phone = rs.getString(6);
				String address = rs.getString(7);
				String password = rs.getString(8);
				
				User u = new User(uid,name,usname,email,gender,phone,address,password,null);
				
				user.add(u);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
public static boolean updateAccount(String uname,String name,String email,String phone,String address) {
		
		//int userID = Integer.parseInt("uid");
		
		boolean isSuccess = false;
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String query = "update userdetails set name='"+name+"',email='"+email+"',phone='"+phone+"',address='"+address+"'"+"where userName='"+uname+"'";
			int rs = stmt.executeUpdate(query);
			
			if (rs > 0) {
				 isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
public static boolean updatePassword(String uid,String p2) {
	
	//int userID = Integer.parseInt("uid");
	
	boolean isSuccess = false;
	
	try {
		con = DBConnection.getConnection();
		stmt = con.createStatement();
		String query = "update userdetails set password='"+p2+"'"+"where userID='"+uid+"'";
		int rs = stmt.executeUpdate(query);
		
		if (rs > 0) {
			 isSuccess = true;
		}
		else {
			isSuccess = false;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return isSuccess;
}

public static boolean deleteAccount(String uid) {
	
	boolean isSuccess = false;
	
	try {
		con = DBConnection.getConnection();
		stmt = con.createStatement();
		String query = "delete from userdetails where userID='"+uid+"'";
		int rs = stmt.executeUpdate(query);
		
		if (rs > 0) {
			 isSuccess = true;
		}
		else {
			isSuccess = false;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return isSuccess;
}
}
