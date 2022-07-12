package com.cognizant.playerservice.controller;

import java.util.List;
import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.playerservice.entities.Player;
import com.cognizant.playerservice.services.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
		
		//get the players
	
		@GetMapping("/players")
		public List<Player> getPlayers()
		{
			
			return this.playerService.getPlayers();
		}
		
		//get single player
		
		@GetMapping("/players/{playerId}")
		public Player getPlayer(@PathVariable String playerId) {
			
			return this.playerService.getPlayer(Long.parseLong(playerId));
		}
		
		//add player
		
		@PostMapping("/players/addPlayer")
		public Player addPlayer(@RequestBody Player player) {
			
			
			return this.playerService.addPlayer(player);
		}
		
		//update player
		
		@PutMapping("/players")
		public Player updatePlayer(@RequestBody Player player) {
			
			return this.playerService.updatePlayer(player);
		}
		
		//delete player
		
		@DeleteMapping("/players/deletePlayer")
		public ResponseEntity<HttpStatus> deletePlayer(@PathVariable String playerId){
			try {
				this.playerService.deletePlayer(Long.parseLong(playerId));
				return new ResponseEntity<>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
	}

