package com.unicesumar.ubsdigital.model.repository;

import com.unicesumar.ubsdigital.model.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
