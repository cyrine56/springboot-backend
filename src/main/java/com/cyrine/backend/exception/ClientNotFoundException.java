package com.cyrine.backend.exception;
/* Created by Arjun Gautam */

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
