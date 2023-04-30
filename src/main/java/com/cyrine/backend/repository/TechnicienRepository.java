package com.cyrine.backend.repository;

import com.cyrine.backend.model.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicienRepository extends JpaRepository<Technicien,Long> {
}
