package com.cyrine.backend.controller;


import com.cyrine.backend.exception.UserNotFoundException;
import com.cyrine.backend.model.Equipement;
import com.cyrine.backend.repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("http://localhost:3000")
public class EquipementController {

    @Autowired
    private EquipementRepository equipementRepository;

    @PostMapping("/Equ")
    Equipement newUser(@RequestBody Equipement newUser) {
        return equipementRepository.save(newUser);
    }

    @GetMapping("/equipements")
    List<Equipement> getAllUsers() {
        return equipementRepository.findAll();
    }

    @GetMapping("/equipement/{id}")
    Equipement getUserById(@PathVariable Long id) {
        return equipementRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

<<<<<<< HEAD

=======
    @PutMapping("/equipement/{id}")
    Equipement updateUser(@RequestBody Equipement newEqu, @PathVariable Long id) {
        return equipementRepository.findById(id)
                .map(equipement -> {
                    equipement.setBur(newEqu.getBur());
                    equipement.setCodeb(newEqu.getCodeb());
                    equipement.setDateFormation(newEqu.getDateFormation());
                    equipement.setEtat(newEqu.getEtat());
                    equipement.setDateLiv(newEqu.getDateLiv());
                    equipement.setDateMiseEnService(newEqu.getDateMiseEnService());
                    equipement.setDateReception(newEqu.getDateReception());
                    equipement.setDateVisitepre(newEqu.getDateVisitepre());
                    equipement.setModelEcran(newEqu.getModelEcran());
                    equipement.setFiche(newEqu.getFiche());
                    equipement.setModelPC(newEqu.getModelPC());
                    equipement.setNumSerieGAB(newEqu.getNumSerieGAB());
                    equipement.setObservation(newEqu.getObservation());
                    equipement.setOs(newEqu.getOs());
                    equipement.setParamReseau(newEqu.getParamReseau());
                    equipement.setTech(newEqu.getTech());
                    return equipementRepository.save(equipement);
                }).orElseThrow(() -> new UserNotFoundException(id));
    }
>>>>>>> 116ba3e3ffe3a27489ea5bbf90d18be52f5b6e1d

    @DeleteMapping("/equipement/{id}")
    String deleteUser(@PathVariable Long id){
        if(!equipementRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        equipementRepository.deleteById(id);
        return  "equipement with id "+id+" has been deleted success.";
    }

}
