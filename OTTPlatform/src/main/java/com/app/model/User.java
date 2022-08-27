package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String fisrtName;
	private String lastName;
	private String address;
	private long mobile;
	private String uemail;
	private String password;
	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(int id, String fisrtName, String lastName, String address, long mobile, String uemail, String password,String role) {
		super();
		this.id = id;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.uemail = uemail;
		this.password = password;
		this.role=role;
		
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", address=" + address
				+ ", mobile=" + mobile + ", uemail=" + uemail + ", password=" + password + ", role=" + role + "]";
	}
	
}
