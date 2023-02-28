package com.myousuf.eventbooking.controller;

import com.myousuf.eventbooking.entity.Event;
import com.myousuf.eventbooking.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EventController {

    @Autowired
    private EventService service;

    @PostMapping("/events")
    public Event addEvent(@RequestBody Event event){
        System.out.println("events : "+event.getTicketPrice());
        return service.addevent(event);
    }

    @GetMapping("/events")
    public List<Event> getEvents(){
        return service.getEvents();
    }

    @GetMapping("/events/{id}")
    public Event getEventByID(@PathVariable("id") Long EventId){
        return service.getEventById(EventId);
    }

    @DeleteMapping("/events/{id}")
    public String deleteEvent(@PathVariable("id") Long EventId){
        service.deleteEvent(EventId);
        return "deletion successful";
    }

    @PutMapping("/events/{id}")
    public Event updateEvent(@PathVariable("id") Long EventId, @RequestBody Event event){
        return service.updateEvent(EventId, event);
    }
}
