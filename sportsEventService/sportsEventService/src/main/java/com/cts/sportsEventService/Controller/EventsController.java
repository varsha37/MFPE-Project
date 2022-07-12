package com.cts.sportsEventService.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.cts.sportsEventService.Model.Events;
import com.cts.sportsEventService.Service.EventsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class EventsController {
    
    @Autowired
    private EventsService eventsService;

    @PostMapping("/addEvent")
    @ResponseBody
    public String addEvent(@RequestBody Events events) {
        this.eventsService.addEvent(events);
        return events+" added successfully";
    }
 
    @DeleteMapping("/deleteEvent")
    @ResponseBody
    public String deleteEvent(@RequestParam int eventId){
        this.eventsService.deleteEvent(eventId);
        return  "deleted successfully";
    }

    @GetMapping("/events")
    @ResponseBody
    public List<Events> getAllEvents(){
        return this.eventsService.getAllEvents();
    }

    @GetMapping("/eventsByName")
    @ResponseBody
    public Events getEventsByName(@RequestParam String name) {
        return this.eventsService.getEventsByName(name);
    }
    
}
