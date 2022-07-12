package com.cts.ParticipationService.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ParticipationService.Model.Participent;


public interface ParticipentRepository extends JpaRepository<Participent,Integer> {


	List<Participent> findByStatus(String status);


}
