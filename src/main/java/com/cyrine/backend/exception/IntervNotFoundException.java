package com.cyrine.backend.exception;

public class IntervNotFoundException extends RuntimeException{
    public IntervNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
