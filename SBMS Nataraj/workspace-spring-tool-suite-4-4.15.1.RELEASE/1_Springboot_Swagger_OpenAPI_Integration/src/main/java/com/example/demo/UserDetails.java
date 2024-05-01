package com.example.demo;

public class UserDetails {
	
	private String firstName;
	private String lastName;
	private int userId;
	
	public UserDetails(String firstName, String lastName, int userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", userId=" + userId + "]";
	}
	
	

}
