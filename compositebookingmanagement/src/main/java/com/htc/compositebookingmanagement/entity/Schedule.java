package com.htc.compositebookingmanagement.entity;

import java.time.LocalDateTime;

public class Schedule {
	
	
	private LocalDateTime information;

	

	public Schedule(LocalDateTime information) {
		super();
		
		this.information = information;
	}

	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getInformation() {
		return information;
	}

	public void setInformation(LocalDateTime information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "Schedule [information=" + information + "]";
	}

}
