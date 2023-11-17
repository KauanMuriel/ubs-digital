package com.unicesumar.ubsdigital.model.repository;

import com.unicesumar.ubsdigital.model.domain.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepository extends JpaRepository<Drug, Integer> {
}
