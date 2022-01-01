package com.alican.grpcHelloWorld.repository;

import com.alican.grpcHelloWorld.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    boolean existsByUsernameIgnoreCase(String username);
}
