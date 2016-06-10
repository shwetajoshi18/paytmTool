package com.aartek.model;

import javax.persistence.*;

@Entity
@Table(name="userLogin")
public class UserLogin {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Id
	@Column(name="email_Id")
	private String emailId;
	
	@Column(name="password")
	private String password;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
