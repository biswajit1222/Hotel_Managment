package com.infosys.app.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class Login {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long loginId;
private String userName;
private String password;
public Login(Long loginId, String userName, String password) {
	super();
	this.loginId = loginId;
	this.userName = userName;
	this.password = password;
}
public Long getLoginId() {
	return loginId;
}
public Login() {
	super();
}
public void setLoginId(Long loginId) {
	this.loginId = loginId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
