package com.cyrine.backend.controller;


import com.cyrine.backend.exception.IntervNotFoundException;
import com.cyrine.backend.exception.UserNotFoundException;
import com.cyrine.backend.model.Interv;
import com.cyrine.backend.repository.IntervRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin ("http://localhost:3000")
public class IntervController {
    @Autowired
    private IntervRepository intervRepository;

    @PostMapping("/interv")
    Interv newInterv (@RequestBody Interv newInterv){
        return intervRepository.save(newInterv);
    }
    @GetMapping("/intervs")
    List<Interv> getAllIntervs(){
        return intervRepository.findAll();
    }
    @GetMapping("intervs/{id}")
    Interv getIntervById(@PathVariable Long id){
        return intervRepository.findById(id)
                .orElseThrow(() ->new IntervNotFoundException(id));
    }

    @PutMapping("/interv/{id}")
    Interv updateInterv(@RequestBody Interv newInterv, @PathVariable Long id) {
        return intervRepository.findById(id)
                .map(interv -> {
                    interv.setClient(newInterv.getClient());
                    interv.setDate(newInterv.getDate());
                    interv.setDateDebut(newInterv.getDateDebut());
                    interv.setHeure(newInterv.getHeure());
                    interv.setDateFIN(newInterv.getDateFIN());
                    interv.setHeureDebut(newInterv.getHeureDebut());
                    interv.setModelMachine(newInterv.getModelMachine());
                    interv.setHeureFin(newInterv.getHeureFin());
                    interv.setNumFiche(newInterv.getNumFiche());
                    interv.setPanne(newInterv.getPanne());
                    interv.setTechnicien(newInterv.getTechnicien());
                    return intervRepository.save(interv);
                }).orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/interv/{id}")
    String deleteInterv(@PathVariable Long id){
        if(!intervRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        intervRepository.deleteById(id);
        return  "equipement with id "+id+" has been deleted success.";
    }

}
