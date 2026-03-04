package com.example.oop_inclass_07.service;

import com.example.oop_inclass_07.model.Booking;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.Valid;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookingService {

private final List<Booking> bookings = new ArrayList<>();
private long nextId = 1;
    public Booking addBooking( Booking booking){
    booking.setId(nextId++);
    bookings.add(booking);
    return booking;
}
public List<Booking> getAllBookings() {
        return bookings;
}

}
