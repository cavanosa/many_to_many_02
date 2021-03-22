package com.tutorial.manytomany02.repository;

import com.tutorial.manytomany02.entity.Canal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanalRepository extends JpaRepository<Canal, Integer> {
}
