package com.cyrine.backend.repository;

import com.cyrine.backend.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers,Long> {
}
