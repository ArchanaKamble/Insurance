package com.lti.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	@GeneratedValue
	private int userId;
	private String name;
	private String email;
	private String password;
	private LocalDate dob;
	private long contact;
	private  String address;
	
	public Users() {
		super();
	}

	public Users(int userId, String name, String email, String password, LocalDate dob, long contact, String address) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.contact = contact;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password + ", dob="
				+ dob + ", contact=" + contact + ", address=" + address + "]";
	}
	
	
}
