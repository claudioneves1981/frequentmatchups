package com.example.frequentmatchups.services;

import com.example.frequentmatchups.dtos.MatchesDTO;
import com.example.frequentmatchups.models.Matches;
import com.example.frequentmatchups.models.Countries;
import com.example.frequentmatchups.repositories.CountriesRepository;
import com.example.frequentmatchups.repositories.MatchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchesService {

    @Autowired
    private CountriesRepository countriesRepository;

    @Autowired
    private MatchesRepository matchesRepository;

    public List<MatchesDTO> findByMatch(Integer countryA, Integer countryB) {
        List<Countries> countries = countriesRepository.findAll();
        List<Matches> matches = matchesRepository.findAll();
        System.out.println(countries.get(countryA));
        List<MatchesDTO> newMatchs =  new ArrayList<>();
        MatchesDTO newMatch = new MatchesDTO();
        for (Matches match : matches) {
            if (match.getCountry_a().equals(countries.get(countryA - 1)) && match.getCountry_b().equals(countries.get(countryB - 1))) {
                newMatch.setCountryA(match.getCountry_a().getCountry());
                newMatch.setCountryB(match.getCountry_b().getCountry());
                newMatch.setEncounterMatch(match.getEncounterMatch());
                newMatch.setGoalsCountryA(match.getGoalsCountryA());
                newMatch.setGoalsCountryB(match.getGoalsCountryB());
                newMatch.setYearMatch(match.getYearMatch());
                newMatchs.add(newMatch);
            }
        }
        return newMatchs;
    }
}
