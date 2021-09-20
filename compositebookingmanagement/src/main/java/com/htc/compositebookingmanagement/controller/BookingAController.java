package com.htc.compositebookingmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htc.compositebookingmanagement.dao.IBooking;
import com.htc.compositebookingmanagement.entity.Booking;
import com.htc.compositebookingmanagement.entity.Center;
import com.htc.compositebookingmanagement.externalservices.CenterService;

@RestController

public class BookingAController {

	@Autowired
	IBooking bookingdao;
	@Autowired
	CenterService centerdao;
	
	@PostMapping("/bookings") Booking createBooking(@RequestBody Booking booking)
	{
		 return bookingdao.save(booking);
		
	}
	@GetMapping("/aggregatedata/{pincode}")
	List<Center> getCenteretails(@RequestParam String pincode)
	{
		List<Center> centerlist=null;
		centerlist=centerdao.findByPincode(pincode);
		return centerlist;
		
	}
	
	
	
	
	
	
	
	
}
