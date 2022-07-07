package com.example.projetbackend.repository;

import com.example.projetbackend.model.entity.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamilleRepository extends JpaRepository<Famille, String> {

    List<Famille> findByName(String name);

    //ZONE - FAMILLE
    @Query(value = "SELECT nom_famille FROM regroupement rg WHERE rg.nom_zone LIKE :zone " , nativeQuery = true)
    List<String> findFamilyByZone(@Param(value = "zone") String zone);

    //TYPE - FAMILLE
    @Query(value = "SELECT * FROM famille f WHERE f.name_type LIKE :type AND f.id_generation <= :gen" , nativeQuery = true)
    List<Famille> findFamilyByType(@Param(value = "type") String type, @Param(value = "gen") int gen);

    //TYPE - FAMILLE EXOTIC
    @Query(value = "SELECT * FROM famille f WHERE f.name_type LIKE :type AND f.exotic_famille = 1 AND f.id_generation <= :gen" , nativeQuery = true)
    List<Famille> findFamilyExoticByType(@Param(value = "type") String type, @Param(value = "gen") int gen);

    @Query(value = "SELECT * FROM famille f WHERE f.id_generation <= :gen" , nativeQuery = true)
    List<Famille> findFamilyByGen(@Param(value = "gen") int gen);

    @Query(value = "SELECT * FROM famille f WHERE f.exotic_famille = 1 AND f.id_generation <= :gen" , nativeQuery = true)
    List<Famille> findFamilyExotic(@Param(value = "gen") int gen);



    @Query(value = "SELECT * FROM famille f WHERE f.nom_famille = :fname", nativeQuery = true)
    Famille findFamilleC(@Param(value = "fname") String fname);
}
