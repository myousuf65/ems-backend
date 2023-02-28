package com.myousuf.eventbooking.service;

import com.myousuf.eventbooking.entity.Event;
import com.myousuf.eventbooking.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public Event addevent(Event event) {
        return repository.save(event);
    }

    public List<Event> getEvents() {
        return repository.findAll();
    }

    public Event getEventById(Long eventId) {
        return repository.findById(eventId).get();
    }

    public void deleteEvent(Long eventId) {
        repository.deleteById(eventId);
    }

    public Event updateEvent(Long eventId, Event event) {

        Event eventdb = repository.findById(eventId).get();

        eventdb.setName(event.getName());
        eventdb.setDate(event.getDate());
        eventdb.setTime(event.getTime());
        eventdb.setCapacity(event.getCapacity());
        eventdb.setTicketPrice(event.getTicketPrice());

        return repository.save(eventdb);
    }
}
