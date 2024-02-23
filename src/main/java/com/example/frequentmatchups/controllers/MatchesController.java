package com.example.frequentmatchups.controllers;

import com.example.frequentmatchups.dtos.MatchesDTO;
import com.example.frequentmatchups.services.MatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchesController {

    @Autowired
    private MatchesService matchesService;

    @GetMapping("/matches/countryA/{countryA}/countryB/{countryB}")
    public List<MatchesDTO> situacao(@PathVariable("countryA") Integer countryA, @PathVariable("countryB") Integer countryB){
        return matchesService.findByMatch(countryA, countryB);
    }

}
