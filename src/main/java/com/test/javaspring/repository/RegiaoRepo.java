package com.test.spring.repository;


import com.test.spring.entity.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegiaoRepo extends JpaRepository<Regiao, Long> {
}
