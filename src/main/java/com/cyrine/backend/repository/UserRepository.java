package com.cyrine.backend.repository;


import com.cyrine.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
//Here, we are creating a UserRepository interface that extends JpaRepository.
// We are also defining a custom method findByUsername to retrieve a User object by username.
