package com.example.projetbackend.repository;

import com.example.projetbackend.model.entity.Rarete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RareRepository extends JpaRepository<Rarete, Integer> {

    @Query(value = "SELECT * FROM rarete r WHERE r.niveau_rarete = :rare" , nativeQuery = true)
    Rarete findRareC(@Param(value = "rare") int rare);

}