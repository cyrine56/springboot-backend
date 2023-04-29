package com.cyrine.backend.controller;

import com.cyrine.backend.model.User;
import com.cyrine.backend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Here, we are creating a UserController class with method login
@CrossOrigin(origins = "http://localhost:3000")// to map the backend with the front end
@RestController
//We are using the @RestController and @RequestMapping annotations to define the root path for the REST endpoints
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    //1** In the login method, we retrieve the user from the database using the findByUsername method of the UserRepository
    @PostMapping("/login")
//This is a Spring MVC annotation that maps HTTP POST requests to the /login endpoint in the REST API.
    public ResponseEntity<?> login(@RequestBody User user) { //takes a User object as a request body and returns a ResponseEntity.
        //We then check if the user exists and if the password provided matches the user's password.
        User existingUser = userRepository.findByUsername(user.getUsername());
        //retrieves a User object from the database using the findByUsername method of the UserRepository
        //It takes the username field from the User object passed in the request body as an argument
        if (existingUser == null || !existingUser.getPassword().equals(user.getPassword())) {
            //If the user is not found or the password does not match, we return a 401 Unauthorized response
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"message\": \"informations d'identification incorrectes\"}");            //The ResponseEntity.ok() method creates a ResponseEntity object with a 200 OK status code
            //and the build() method builds the ResponseEntity object and returns it as the response.
        }
        //Otherwise, we return a 200 OK response.

        String role = existingUser.getRole();
        if (role.equals("client")) {
            return ResponseEntity.ok().body("{\"message\": \"Client login successful\", \"redirect\": \"/client\"}");
        } else if (role.equals("coordinateur")) {
            return ResponseEntity.ok().body("{\"message\": \"Coordinateur login successful\", \"redirect\": \"/coordinateur\"}");
        } else if (role.equals("technicien")) {
            return ResponseEntity.ok().body("{\"message\": \"Technicien login successful\", \"redirect\": \"/technicien\"}");
        } else if (role.equals("gestionnaire")){
            return ResponseEntity.ok().body("{\"message\": \"Manager login successful\", \"redirect\": \"/gest\"}");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"message\": \"Unknown user type\"}");
        }


    }
}