package com.cognizant.playerservice.services;

import java.util.List;

import com.cognizant.playerservice.entities.Player;

public interface PlayerService {

	public List<Player> getPlayers();
	
	public Player getPlayer(long player_id);
	
	public Player addPlayer(Player player);

	public Player updatePlayer(Player player);
	
	public void deletePlayer(long parseLong);
}
