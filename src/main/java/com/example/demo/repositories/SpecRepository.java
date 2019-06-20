package com.example.demo.repositories;

import com.example.demo.entities.Spec;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecRepository extends JpaRepository<Spec, Long> {
}
