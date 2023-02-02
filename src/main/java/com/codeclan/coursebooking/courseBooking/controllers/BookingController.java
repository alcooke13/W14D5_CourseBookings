package com.codeclan.coursebooking.courseBooking.controllers;


import com.codeclan.coursebooking.courseBooking.models.Booking;
import com.codeclan.coursebooking.courseBooking.repositories.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingsRepository bookingsRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bookings/{id}")
    public ResponseEntity  getBooking(@PathVariable Long id){
        return new ResponseEntity<>(bookingsRepository.findById(id), HttpStatus.OK);
    }
}