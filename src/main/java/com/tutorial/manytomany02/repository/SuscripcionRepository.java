package com.tutorial.manytomany02.repository;

import com.tutorial.manytomany02.entity.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
}
