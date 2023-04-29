package com.cyrine.backend.controller;
import com.cyrine.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:3000")// to map the backend with the front end
public class StatistiqueController {
    @Autowired
    private EquipementRepository equipementRepository;

    @Autowired
    private IntervRepository intervRepository;

    @Autowired
    private CustomersRepository customersRepository;

    @GetMapping("/nbequipement")
    int getTotalEquipements(){
        return equipementRepository.findAll().size();
    }
    @GetMapping("/nbintervs")
    int getTotalIntervs(){
        return intervRepository.findAll().size();
    }
    @GetMapping("/nbclients")
    int getTotalClient(){
        return customersRepository.findAll().size();
    }

}
