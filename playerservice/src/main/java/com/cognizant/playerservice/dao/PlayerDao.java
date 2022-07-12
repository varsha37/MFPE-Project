package com.cognizant.playerservice.dao;

import com.cognizant.playerservice.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerDao extends JpaRepository<Player,Long> {

}
