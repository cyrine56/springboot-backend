package com.cyrine.backend.controller;



import com.cyrine.backend.model.Rapport;
import com.cyrine.backend.repository.RapportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class RapportController {

    @Autowired
   private RapportRepository rapportRepository;

    @GetMapping("/rapports")
    List<Rapport> getAllReports(){
        return rapportRepository.findAll();
    }




}
