package com.myousuf.eventbooking.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "EventsTable")
public class Event {

    @SequenceGenerator(
            name = "event_sequence",
            sequenceName = "event_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "event_sequence"
    )
    @Id
    private Long EventId;
    private String name;
    private LocalDate date;
    private LocalTime time;
    private String capacity;
    private Integer TicketPrice;

    public Event() {
    }

    public Event(Long EventId, String name, LocalDate date, LocalTime time, String capacity, Integer TicketPrice) {
        this.EventId = EventId;
        this.name = name;
        this.date = date;
        this.time = time;
        this.capacity = capacity;
        this.TicketPrice = TicketPrice;
    }

    public Long getId() {
        return EventId;
    }

    public void setId(Long id) {
        this.EventId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Integer getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(Integer TicketPrice) {
        this.TicketPrice = TicketPrice;
    }
}
