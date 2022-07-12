package com.cognizant.playerservice.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.playerservice.dao.PlayerDao;
import com.cognizant.playerservice.entities.Player;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerDao playerDao;
	

	
	public PlayerServiceImpl() {
		
	}

	@Override
	public List<Player> getPlayers() {
		return playerDao.findAll();
	}

	@Override
	public Player getPlayer(long playerId) {
		return playerDao.getOne(playerId);
	}

	@Override
	public Player addPlayer(Player player) {
		playerDao.save(player);
		return player;
	}
	
	@Override
	public void deletePlayer(long parseLong) {
		
		Player entity=playerDao.getOne(parseLong);
		playerDao.delete(entity);
			
		}

	@Override
	public Player updatePlayer(Player player) {
		
		
		playerDao.save(player);
		return player;
	}

			
	}

	


