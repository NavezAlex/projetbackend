package com.example.projetbackend.repository;

import com.example.projetbackend.model.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GenRepository extends JpaRepository<Generation, Integer>{
    @Query(value = "SELECT * FROM generation g WHERE g.id_generation = :gen" , nativeQuery = true)
    Generation findGen(@Param(value = "gen") int gen);

    @Query(value = "SELECT * FROM generation g WHERE g.id_generation = :gen" , nativeQuery = true)
    Generation findGenC(@Param(value = "gen") int gen);

}
