package com.myousuf.eventbooking.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "BookingsTable")
public class Booking {

    @ManyToOne
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "UserId"
    )
    private User user;

    @ManyToOne
    @JoinColumn(
            name = "event_id",
            referencedColumnName = "EventId"
    )
    private Event event;

    @Id
    @SequenceGenerator(
            name = "bookings_sequence",
            sequenceName = "bookings_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "bookings_sequence"
    )
    private Long BookingsId;
    private Integer TicketsReleased;

    public Booking(){}

    public Booking(User user, Event event, Long bookingsId, Integer ticketsReleased) {
        this.user = user;
        this.event = event;
        BookingsId = bookingsId;
        TicketsReleased = ticketsReleased;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Long getBookingsId() {
        return BookingsId;
    }

    public void setBookingsId(Long bookingsId) {
        BookingsId = bookingsId;
    }

    public Integer getTicketsReleased() {
        return TicketsReleased;
    }

    public void setTicketsReleased(Integer ticketsReleased) {
        TicketsReleased = ticketsReleased;
    }
}
