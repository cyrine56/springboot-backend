package com.cyrine.backend.controller;



import com.cyrine.backend.exception.UserNotFoundException;
import com.cyrine.backend.model.Rapport;
import com.cyrine.backend.repository.RapportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/rapport/{id}")
    String deleteRapport(@PathVariable Long id){
        if(!rapportRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        rapportRepository.deleteById(id);
        return  "equipement with id "+id+" has been deleted success.";
    }


}
