package com.cts.sportsEventService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.sportsEventService.Model.Events;
import com.cts.sportsEventService.Repository.EventsRepository;

@Service
public class EventsService {
    

    @Autowired
    private EventsRepository eventsRepository;

    public void addEvent(@RequestParam Events events){
        this.eventsRepository.save(events);
    }

    public void deleteEvent(@RequestParam int eventId){
        this.eventsRepository.deleteById(eventId);;
    }

    public List<Events> getAllEvents(){
        return this.eventsRepository.getAllEvents();
    }

    public Events getEventsByName(@RequestParam String name){
        return this.eventsRepository.getEventsByName(name);
    }
}
