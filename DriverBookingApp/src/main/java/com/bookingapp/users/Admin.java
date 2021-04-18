package com.bookingapp.users;

public class Admin {
	
	private int driverid;
	private String name;
	private int rating;
	private String location;
	private double charges;
	private long phone;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int driverid, String name, int rating, String location, double charges, long phone) {
		super();
		this.driverid = driverid;
		this.name = name;
		this.rating = rating;
		this.location = location;
		this.charges = charges;
		this.phone=phone;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Admin [driverid=" + driverid + ", name=" + name + ", rating=" + rating + ", location=" + location
				+ ", charges=" + charges + ", phone=" + phone + "]";
	}
	
	
	
	

}
