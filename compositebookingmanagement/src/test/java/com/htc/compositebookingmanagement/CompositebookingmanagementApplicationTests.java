package com.htc.compositebookingmanagement;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.htc.compositebookingmanagement.dao.IBooking;
import com.htc.compositebookingmanagement.entity.Booking;
import com.htc.compositebookingmanagement.entity.Center;
import com.htc.compositebookingmanagement.entity.Schedule;
import com.htc.compositebookingmanagement.entity.User;

@SpringBootTest
class CompositebookingmanagementApplicationTests {
	
	@Autowired
	IBooking repo;
	List<Center> centerList = new ArrayList<Center>();
    List<Schedule> schedulelist= new ArrayList<Schedule>();
    
	
	List <User> userList =new ArrayList<User>();
	

	@Test
	public void CreatingNewAppointment_Appointment_() {
		Booking booking = new Booking(2L,userList,centerList,LocalDate.of(2021,2,3));
		schedulelist.add(new Schedule(LocalDateTime.now()));
		centerList.add(1, new Center(3L,"vijaywada"," near railway station","520008",schedulelist));
		userList.add(2,new User(2L,"ashish","ashish@gmail.com",23,9912));
	
		repo.save(booking);
		
		assertNotNull(repo.getById(2L));
	}
}
