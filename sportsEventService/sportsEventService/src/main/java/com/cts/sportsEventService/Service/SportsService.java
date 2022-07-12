package com.cts.sportsEventService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.sportsEventService.Model.Sports;
import com.cts.sportsEventService.Repository.SportsRepository;

@Service
public class SportsService {

    @Autowired
    private SportsRepository sportsRepository;

    public List<Sports> getAllSports(){
        List<Sports> slist = this.sportsRepository.getAllSports();
        return slist;
    }

    public Sports getSportsByName(@RequestParam String name){
        Sports sports = this.sportsRepository.getSportsByName(name);
        return sports;
    }
}
