package com.cts.sportsEventService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.sportsEventService.Model.Sports;
import com.cts.sportsEventService.Service.SportsService;

@RestController
public class SportsController {
    
    @Autowired
    private SportsService sportsService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello World";
    }

    @GetMapping("/sports")
    @ResponseBody
    public List<Sports> getAllSports(){
        List<Sports> slist = this.sportsService.getAllSports();
        return slist;
    }

    @GetMapping("/getSportsByName")
    @ResponseBody
    public Sports getSportsByName(@RequestParam String name){
        Sports sports = this.sportsService.getSportsByName(name);
        return sports;
    }
}
