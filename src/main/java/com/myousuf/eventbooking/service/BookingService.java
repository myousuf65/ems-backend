package com.myousuf.eventbooking.service;

import com.myousuf.eventbooking.entity.Booking;
import com.myousuf.eventbooking.entity.Event;
import com.myousuf.eventbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repository;

    public Booking addBooking(Booking booking) {
        return repository.save(booking);
    }

    public List<Booking> getBookings() {
        return repository.findAll();
    }

    public Booking getBookingById(Long bookingId) {
        return repository.findById(bookingId).get();
    }

    public void deleteBooking(Long bookingId) {
        repository.deleteById(bookingId);
    }

    public Booking updateBooking(Long bookingId, Booking booking) {

        Booking bookingdb = repository.findById(bookingId).get();

        bookingdb.setBookingsId(booking.getBookingsId());
        bookingdb.setTicketsReleased(booking.getTicketsReleased());

        return repository.save(bookingdb);
    }
}
