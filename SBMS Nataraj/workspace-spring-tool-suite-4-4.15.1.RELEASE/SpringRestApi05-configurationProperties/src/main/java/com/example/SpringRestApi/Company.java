package com.example.SpringRestApi;


public class Company {

	private String name;
	private String address;
	private Long pincode;
	private Long contact;
	public Company(String name, String address, Long pincode, Long contact) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", pincode=" + pincode + ", contact=" + contact + "]";
	}
	
	
	
}
