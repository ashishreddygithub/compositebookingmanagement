package com.htc.compositebookingmanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5815139255599262586L;
	
	private long userId;
	private String userName;
	private String emailAddress;
	private int age;
	private double phoneNumber;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userId, String userName, String emailAddress, int age, double phoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailAddress=" + emailAddress + ", age=" + age
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
