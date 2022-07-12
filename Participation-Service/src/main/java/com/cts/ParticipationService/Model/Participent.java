package com.cts.ParticipationService.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Participent {

	    @Id
	    private int participationId;
	    private int playerId;
	    private String playerName;
	    private int eventId;
	    private String eventName;
	    private int sportsId;
	    private String sportsName;
	    private String status;


	    public Participent(){
	    	super();
	    }


	    public Participent(int participationId,int playerId,String playerName,int eventId, String eventName, int sportsId, String sportsName,String status) {
	    	super();
	    	this.participationId = participationId;
	    	this.playerId = playerId;
	    	this.playerName = playerName;
	    	this.eventId = eventId;
	        this.eventName = eventName;
	        this.sportsId = sportsId;
	        this.sportsName = sportsName;
	        this.status=status;
	    }




		public int getParticipationId() {
			return participationId;
		}


		public void setParticipationId(int participationId) {
			this.participationId = participationId;
		}


		public int getPlayerId() {
			return playerId;
		}


		public void setPlayerId(int playerId) {
			this.playerId = playerId;
		}


		public String getPlayerName() {
			return playerName;
		}


		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}


		public int getEventId() {
			return eventId;
		}


		public void setEventId(int eventId) {
			this.eventId = eventId;
		}


		public String getEventName() {
			return eventName;
		}


		public void setEventName(String eventName) {
			this.eventName = eventName;
		}


		public int getSportsId() {
			return sportsId;
		}


		public void setSportsId(int sportsId) {
			this.sportsId = sportsId;
		}


		public String getSportsName() {
			return sportsName;
		}


		public void setSportsName(String sportsName) {
			this.sportsName = sportsName;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		@Override
		public String toString() {
			return "Participent [participationId=" + participationId + ", playerId=" + playerId + ", playerName="
					+ playerName + ", eventId=" + eventId + ", eventName=" + eventName + ", sportsId=" + sportsId
					+ ", sportsName=" + sportsName + ", status=" + status + "]";
		}

	   
	    
}
