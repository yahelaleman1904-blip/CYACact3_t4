package com.yahel.crud_act3.repository;

import com.yahel.crud_act3.entity.Consola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsolaRepository extends JpaRepository<Consola, Long> {
}