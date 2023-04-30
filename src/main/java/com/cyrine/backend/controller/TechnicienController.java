package com.cyrine.backend.controller;


import com.cyrine.backend.exception.IntervNotFoundException;
import com.cyrine.backend.exception.UserNotFoundException;
import com.cyrine.backend.model.Interv;
import com.cyrine.backend.model.Technicien;
import com.cyrine.backend.repository.TechnicienRepository;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TechnicienController {

    @Autowired
    private TechnicienRepository technicienRepository;

    @PostMapping("/tech")
    Technicien newTech(@RequestBody Technicien newtech){
        return technicienRepository.save(newtech);
    }
    @GetMapping("/techniciens")
    List<Technicien> getAllTech(){
        return technicienRepository.findAll();
    }
    @GetMapping("/tech/{id}")
    Technicien getTechById(@PathVariable Long id){
        return technicienRepository.findById(id)
                .orElseThrow(() ->new IntervNotFoundException(id));
    }
    @DeleteMapping("/tech/{id}")
    String deleteInterv(@PathVariable Long id){
        if(!technicienRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        technicienRepository.deleteById(id);
        return  "equipement with id "+id+" has been deleted success.";
    }
}
