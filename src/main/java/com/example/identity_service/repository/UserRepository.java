package com.example.identity_service.repository;

import com.example.identity_service.entity.User;
import org.apache.catalina.startup.Tomcat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);

    String username(String username);
}
