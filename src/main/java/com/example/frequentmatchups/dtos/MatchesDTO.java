package com.example.frequentmatchups.dtos;

import lombok.Data;

@Data
public class MatchesDTO {

    private String countryA;

    private String countryB;

    private Integer goalsCountryA;

    private Integer goalsCountryB;

    private Integer yearMatch;

    private String encounterMatch;

}
