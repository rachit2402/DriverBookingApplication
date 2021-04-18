package com.bookingapp.users;

public class CustRegister {
	String name;
	String username;
	String location;
	int pincode;
	long phone;
	String email;
	String password;
	
	public CustRegister() {
		// TODO Auto-generated constructor stub
		super();
	}

	public CustRegister(String name, String username, String location, int pincode, long phone, String email,String password) {
		super();
		this.name = name;
		this.username = username;
		this.location = location;
		this.pincode = pincode;
		this.phone = phone;
		this.email = email;
		this.password=password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Register [name=" + name + ", username=" + username + ", location=" + location + ", pincode=" + pincode
				+ ", phone=" + phone + ", email=" + email + ", password=" + password + "]";
	}

	
	
	

}
