package com.cts.sportsEventService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.sportsEventService.Model.Sports;

public interface SportsRepository extends JpaRepository<Sports,Integer> {

    @Query("Select s from Sports s")
    public List<Sports> getAllSports();
     
    @Query("Select s from Sports s where s.sportsName=?1")
    public Sports getSportsByName(@RequestParam String name);

}