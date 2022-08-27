package com.app.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserRequest {
	@Id
	
	private String email;
	private String password;
	private String role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserRequest [email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	public UserRequest(String email, String password, String role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	
}
