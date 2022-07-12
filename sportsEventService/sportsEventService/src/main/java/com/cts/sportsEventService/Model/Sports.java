package com.cts.sportsEventService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sports")
public class Sports {

    @Id
    @Column(name="sportsId")
    private Long sportsId;

    @Column(name="noOfPlayers")
    private Long noOfPlayers;

    @Column(name="sportsName")
    private String sportsName;

    @Column(name="sportsType")
    private String sportsType;

    public Sports() {
    }

    public Sports(Long sportsId, Long noOfPlayers, String sportsName, String sportsType) {
        this.sportsId = sportsId;
        this.noOfPlayers = noOfPlayers;
        this.sportsName = sportsName;
        this.sportsType = sportsType;
    }


    public Long getSportsId() {
        return this.sportsId;
    }

    public void setSportsId(Long sportsId) {
        this.sportsId = sportsId;
    }

    public Sports sportsId(Long sportsId) {
        setSportsId(sportsId);
        return this;
    }

    public Long getNoOfPlayers() {
        return this.noOfPlayers;
    }

    public void setNoOfPlayers(Long noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public Sports noOfPlayers(Long noOfPlayers) {
        setNoOfPlayers(noOfPlayers);
        return this;
    }

    public String getSportsName() {
        return this.sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public Sports sportsName(String sportsName) {
        setSportsName(sportsName);
        return this;
    }

    public String getSportsType() {
        return this.sportsType;
    }

    public void setSportsType(String sportsType) {
        this.sportsType = sportsType;
    }

    public Sports sportsType(String sportsType) {
        setSportsType(sportsType);
        return this;
    }

    
    @Override
    public String toString() {
        return "{" +
            " sportsId='" + getSportsId() + "'" +
            ", noOfPlayers='" + getNoOfPlayers() + "'" +
            ", sportsName='" + getSportsName() + "'" +
            ", sportsType='" + getSportsType() + "'" +
            "}";
    }
}
