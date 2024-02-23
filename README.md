
This project serves to consult the meetings of the following teams
in world cups that had more than 4 direct confrontations
To know how to check the comparison, just type the names of two countries
If these countries have faced each other, it will show the confrontations in which they
the scores competed and what was the dispute that led to the confrontation.

- BRAZIL
- SWEDEN,
- ARGENTINA,
- ENGLAND,
- NIGERIA,
- ITALY,
- NETHERLANDS,
- FRANCE,
- CZECHOSLOVAKIA,
- MEXICO,
- SPAIN;

query example

```
http://localhost:8080/matches/countryA/italy/countryB/brazil
```

the result will be.

```
{
        "countryA": "BRAZIL",
        "countryB": "ITALY",
        "goalsCountryA": 1,
        "goalsCountryB": 2,
        "yearMatch": 1938,
        "encounterMatch": "Semi-Finals"
    },
    {
        "countryA": "BRAZIL",
        "countryB": "ITALY",
        "goalsCountryA": 4,
        "goalsCountryB": 1,
        "yearMatch": 1970,
        "encounterMatch": "Final"
    },
    {
        "countryA": "BRAZIL",
        "countryB": "ITALY",
        "goalsCountryA": 2,
        "goalsCountryB": 1,
        "yearMatch": 1978,
        "encounterMatch": "Third-place Match"
    },
    {
        "countryA": "BRAZIL",
        "countryB": "ITALY",
        "goalsCountryA": 2,
        "goalsCountryB": 3,
        "yearMatch": 1982,
        "encounterMatch": "Second Group Stage"
    },
    {
        "countryA": "BRAZIL",
        "countryB": "ITALY",
        "goalsCountryA": 3,
        "goalsCountryB": 2,
        "yearMatch": 1994,
        "encounterMatch": "Final"
    }
]
```
used technologies

Maven
Java 17
SpringBoot
MySql
