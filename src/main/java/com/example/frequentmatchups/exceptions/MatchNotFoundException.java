package com.example.frequentmatchups.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MatchNotFoundException extends Exception {

    public MatchNotFoundException(String msg){
        super(msg);
    }
}
