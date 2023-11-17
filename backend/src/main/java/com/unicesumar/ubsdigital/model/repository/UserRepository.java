package com.unicesumar.ubsdigital.model.repository;

import com.unicesumar.ubsdigital.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
