package com.app.dto;

import java.util.Scanner;

import com.app.model.User;
public class InputRequest {

	static  Scanner sn=new Scanner(System.in);
	 public static User register() {
		
		 System.out.println("Enter User Details:");
		 System.out.println("Enter user first name:");
		 String fname=sn.next();
		 System.out.println("Enter user last name:");
		 String lname=sn.next();
		 System.out.println("Enter user address:");
		 String address=sn.next();
		 System.out.println("Enter user mobile:");
		 long mob=sn.nextLong();
		 System.out.println("Enter user Email:");
		 String email=sn.next();
		 System.out.println("Enter user password:");
		 String pass=sn.next();
		 System.out.println("Enter user Role:");
		 String role=sn.next();
		return addUser(fname, lname, address, mob, email, pass,role);
		 
	 }
	public static UserRequest login() {
		System.out.println("Enter user  Email:");
		 String uemail=sn.next();
		 System.out.println("Enter user password:");
		 String pass=sn.next();
		 System.out.println("Enter user Role:");
		 String role=sn.next();
		 return new UserRequest(uemail,pass,role);
	 }


	private static User addUser(String fname, String lname, String address, long mob, String uemail, String pass,String role) {
		User user=new User();
		 
		 user.setFisrtName(fname);
		 user.setLastName(lname);
		 user.setMobile(mob);
		 user.setAddress(address);
		 user.setUemail(uemail);
		 user.setPassword(pass);
		 user.setRole(role);
		 return user;
	}
}
