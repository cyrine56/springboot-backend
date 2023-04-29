package com.cyrine.backend.controller;



import com.cyrine.backend.model.Client;
import com.cyrine.backend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/clis")
    List<Client> getAllReports(){
        return clientRepository.findAll();
    }



}
