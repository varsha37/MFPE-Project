package com.cts.sportsEventService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.sportsEventService.Model.Events;



public interface EventsRepository extends JpaRepository<Events,Integer> {
    
    // @Modifying
    // @Transactional
    // @Query(value="Insert into Events(eventId,eventDate,eventName,noOfSlots,sportsName) values(:eventId,:eventDate,:eventName,:noOfSlots,:sportsName)",nativeQuery = true)
    // public void addEvent(@Param("eventId") int eventId,@Param("eventDate") String eventDate, 
    // @Param("eventName") String eventName, @Param("noOfSlots") int noOfSlots,@Param("sportsName") String sportsName);

    @Query("Delete from Events e where e.eventId=?1")
    public void deleteEvent(@RequestParam int eventId);

    @Query("Select e from Events e")
    public List<Events> getAllEvents();

    @Query("select e from Events e where e.eventName = ?1")
    public Events getEventsByName(@RequestParam String name);
}
