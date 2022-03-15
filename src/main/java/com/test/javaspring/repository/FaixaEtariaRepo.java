package com.test.spring.repository;

import com.test.spring.entity.FaixaEtaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaixaEtariaRepo extends JpaRepository<FaixaEtaria, Long> {
}
