package com.tutorial.manytomany02.repository;

import com.tutorial.manytomany02.entity.Canal;
import com.tutorial.manytomany02.entity.Suscripcion;
import com.tutorial.manytomany02.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
    boolean existsByUsuarioAndCanal(Usuario usuario, Canal canal);
}
