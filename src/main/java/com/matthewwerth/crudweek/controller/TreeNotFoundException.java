package com.matthewwerth.crudweek.controller;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class TreeNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public String ResourceNotFoundException(String message) {
        return message;
    }
}

