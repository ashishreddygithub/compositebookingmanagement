package com.htc.compositebookingmanagement.entity;

import java.io.Serializable;
import java.util.List;


public class Center implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 758146584963375859L;
	
	private long centerId;
	private String centerName;
	private String address;
	private String pincode;
	private List<Schedule> schedules;
	public Center() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Center(long centerId, String centerName, String address, String pincode, List<Schedule> schedules) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.address = address;
		this.pincode = pincode;
		this.schedules = schedules;
	}
	public long getCenterId() {
		return centerId;
	}
	public void setCenterId(long centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public List<Schedule> getSchedules() {
		return schedules;
	}
	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (centerId ^ (centerId >>> 32));
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
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
		Center other = (Center) obj;
		if (centerId != other.centerId)
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Center [centerId=" + centerId + ", centerName=" + centerName + ", address=" + address + ", pincode="
				+ pincode + ", schedules=" + schedules + "]";
	}
	
}
