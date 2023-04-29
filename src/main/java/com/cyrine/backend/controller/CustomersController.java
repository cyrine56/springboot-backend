package com.cyrine.backend.controller;



import com.cyrine.backend.model.Customers;
import com.cyrine.backend.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
