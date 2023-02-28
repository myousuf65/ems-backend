package com.myousuf.eventbooking.controller;


import com.myousuf.eventbooking.entity.Booking;
import com.myousuf.eventbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService service;

    @PostMapping("/Bookings")
    public Booking addBooking(@RequestBody Booking Booking){
        return service.addBooking(Booking);
    }

    @GetMapping("/Bookings")
    public List<Booking> getBookings(){
        return service.getBookings();
    }

    @GetMapping("/Bookings/{id}")
    public Booking getBookingByID(@PathVariable("id") Long BookingId){
        return service.getBookingById(BookingId);
    }

    @DeleteMapping("/Bookings/{id}")
    public String deleteBooking(@PathVariable("id") Long BookingId){
        service.deleteBooking(BookingId);
        return "deletion successful";
    }

    @PutMapping("/Bookings/{id}")
    public Booking updateBooking(@PathVariable("id") Long BookingId, @RequestBody Booking Booking){
        return service.updateBooking(BookingId, Booking);
    }
}
