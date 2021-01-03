package com.store.model;

public class User {
	private int userID;
	private String name;
	private String userName;
	private String email;
	private String gender;
	private String phone;
	private String address;
	private String password;
	private String roll;
	
	public User() {
		
	}
	
	public User(int userID, String name, String userName, String email, String gender, String phone, String address,
			String password, String roll) {
		super();
		this.userID = userID;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.password = password;
		this.roll = roll;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	
	
}
