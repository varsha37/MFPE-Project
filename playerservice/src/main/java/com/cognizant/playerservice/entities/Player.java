package com.cognizant.playerservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	private long player_id;
	private String player_name;
	private int age;
	private long contact_number;
	private String email;
	private String gender;
	private String sports_name;
	
	public Player(long player_id, String player_name, int age, long contact_number, String email, String gender,
			String sports_name) {
		super();
		this.player_id = player_id;
		this.player_name = player_name;
		this.age = age;
		this.contact_number = contact_number;
		this.email = email;
		this.gender = gender;
		this.sports_name = sports_name;
	}

	public Player() {
		super();
	}


	public long getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(long player_id) {
		this.player_id = player_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSports_name() {
		return sports_name;
	}

	public void setSports_name(String sports_name) {
		this.sports_name = sports_name;
	}
	
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", player_name=" + player_name + ", age=" + age + ", contact_number="
				+ contact_number + ", email=" + email + ", gender=" + gender + ", sports_name=" + sports_name + "]";
	}

}
