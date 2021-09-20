package com.htc.compositebookingmanagement.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bookinginfo")
public class Booking {
 private Long bookingId;
 private List<User> userList;
 private  List<Center> centerList;
 private LocalDate availableDate;
public Booking(Long bookingId, List<User> userList, List<Center> centerList, LocalDate availableDate) {
	super();
	this.bookingId = bookingId;
	this.userList = userList;
	this.centerList = centerList;
	this.availableDate = availableDate;
}
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getBookingId() {
	return bookingId;
}
public void setBookingId(Long bookingId) {
	this.bookingId = bookingId;
}
public List<User> getUserList() {
	return userList;
}
public void setUserList(List<User> userList) {
	this.userList = userList;
}
public List<Center> getCenterList() {
	return centerList;
}
public void setCenterList(List<Center> centerList) {
	this.centerList = centerList;
}
public LocalDate getAvailableDate() {
	return availableDate;
}
public void setAvailableDate(LocalDate availableDate) {
	this.availableDate = availableDate;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bookingId == null) ? 0 : bookingId.hashCode());
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
	Booking other = (Booking) obj;
	if (bookingId == null) {
		if (other.bookingId != null)
			return false;
	} else if (!bookingId.equals(other.bookingId))
		return false;
	return true;
}
@Override
public String toString() {
	return "Booking [bookingId=" + bookingId + ", userList=" + userList + ", centerList=" + centerList
			+ ", availableDate=" + availableDate + "]";
}
 



}
