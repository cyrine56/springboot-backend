package com.cyrine.backend.repository;

import com.cyrine.backend.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientRepository extends JpaRepository<Client,Long> {
}
