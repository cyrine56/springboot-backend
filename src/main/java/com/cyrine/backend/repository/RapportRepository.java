package com.cyrine.backend.repository;


import com.cyrine.backend.model.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RapportRepository extends JpaRepository<Rapport,Long> {
}
