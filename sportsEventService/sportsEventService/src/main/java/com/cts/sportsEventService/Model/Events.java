package com.cts.sportsEventService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Events")
public class Events {
    @Id
    @Column(name="eventId")
    private int eventId;

    @Column(name="eventDate")
    private String eventDate;

    @Column(name="eventName")
    private String eventName;

    @Column(name="noOfSlots")
    private int noOfSlots;

    @Column(name="sportsName")
    private String sportsName;

    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(name="sportsName",referencedColumnName = "sportsName")
    // private Sports sports;

    public Events(){
    }


    public Events(int eventId, String eventDate, String eventName, int noOfSlots, String sportsName) {
        this.eventId = eventId;
        this.eventDate = eventDate;
        this.eventName = eventName;
        this.noOfSlots = noOfSlots;
        this.sportsName = sportsName;
    }

    public int getEventId() {
        return this.eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Events eventId(int eventId) {
        setEventId(eventId);
        return this;
    }

    public String getEventDate() {
        return this.eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public Events eventDate(String eventDate) {
        setEventDate(eventDate);
        return this;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Events eventName(String eventName) {
        setEventName(eventName);
        return this;
    }

    public int getNoOfSlots() {
        return this.noOfSlots;
    }

    public void setNoOfSlots(int noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public Events noOfSlots(int noOfSlots) {
        setNoOfSlots(noOfSlots);
        return this;
    }

    public String getSportsName() {
        return this.sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public Events sportsName(String sportsName) {
        setSportsName(sportsName);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " eventId='" + getEventId() + "'" +
            ", eventDate='" + getEventDate() + "'" +
            ", eventName='" + getEventName() + "'" +
            ", noOfSlots='" + getNoOfSlots() + "'" +
            ", sportsName='" + getSportsName() + "'" +
            "}";
    }
    

}
