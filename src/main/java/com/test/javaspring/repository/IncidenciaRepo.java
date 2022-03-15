package com.test.spring.repository;

import com.test.spring.entity.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepo extends JpaRepository<Incidencia, Long> {
}
