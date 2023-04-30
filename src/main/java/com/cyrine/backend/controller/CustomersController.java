package com.cyrine.backend.controller;



import com.cyrine.backend.exception.UserNotFoundException;
import com.cyrine.backend.model.Customers;
import com.cyrine.backend.model.Interv;
import com.cyrine.backend.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CustomersController {

    @Autowired
    private CustomersRepository customersRepository;

    @GetMapping("/customs")
    List<Customers> getAllReports(){
        return customersRepository.findAll();
    }

    @PostMapping("/custom")
    Customers newCustom (@RequestBody Customers newCustom){
        return customersRepository.save(newCustom);
    }
    @DeleteMapping("/custom/{id}")
    String deleteInterv(@PathVariable Long id){
        if(!customersRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        customersRepository.deleteById(id);
        return  "equipement with id "+id+" has been deleted success.";
    }
}
