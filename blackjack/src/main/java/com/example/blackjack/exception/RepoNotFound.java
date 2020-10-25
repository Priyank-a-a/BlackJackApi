package com.example.blackjack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class RepoNotFound extends RuntimeException{
    private static final long serialVersionUId = 1L;

    public RepoNotFound(String msg)
    {
        super(msg);
    }
}
