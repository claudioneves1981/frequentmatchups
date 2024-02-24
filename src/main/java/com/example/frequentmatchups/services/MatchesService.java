package com.example.frequentmatchups.services;

import com.example.frequentmatchups.dtos.MatchesDTO;
import com.example.frequentmatchups.enuns.CountriesEnum;
import com.example.frequentmatchups.exceptions.MatchNotFoundException;
import com.example.frequentmatchups.models.Matches;
import com.example.frequentmatchups.models.Countries;
import com.example.frequentmatchups.repositories.CountriesRepository;
import com.example.frequentmatchups.repositories.MatchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class MatchesService {

    @Autowired
    private CountriesRepository countriesRepository;

    @Autowired
    private MatchesRepository matchesRepository;

    public List<MatchesDTO> findByMatch(String countryA, String countryB) throws MatchNotFoundException {

        try {
            CountriesEnum countriesEnumA = CountriesEnum.valueOf(countryA.toUpperCase());
            int countryAindex = countriesEnumA.ordinal();

            CountriesEnum countriesEnumB = CountriesEnum.valueOf(countryB.toUpperCase());
            int countryBindex = countriesEnumB.ordinal();

            List<Countries> countries = countriesRepository.findAll();
            List<Matches> matches = matchesRepository.findAll();
            List<MatchesDTO> newMatchs =  new ArrayList<>();

            for (Matches match : matches) {

                    if ((match.getCountry_a().equals(countries.get(countryAindex)) && match.getCountry_b().equals(countries.get(countryBindex)))
                        || match.getCountry_b().equals(countries.get(countryAindex)) && match.getCountry_a().equals(countries.get(countryBindex))) {
                        MatchesDTO newMatch = new MatchesDTO();
                        newMatch.setCountryA(match.getCountry_a().getCountry());
                        newMatch.setCountryB(match.getCountry_b().getCountry());
                        newMatch.setYearMatch(match.getYearMatch());
                        newMatch.setEncounterMatch(match.getEncounterMatch());
                        newMatch.setGoalsCountryA(match.getGoalsCountryA());
                        newMatch.setGoalsCountryB(match.getGoalsCountryB());
                        newMatchs.add(newMatch);
                  }
            }
            return newMatchs;
        }catch(IllegalArgumentException e){
            throw new MatchNotFoundException("Match Not Found");
        }

    }
}
