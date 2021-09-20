package com.htc.compositebookingmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.compositebookingmanagement.entity.Booking;

public interface IBooking extends JpaRepository<Booking, Long> {

}
