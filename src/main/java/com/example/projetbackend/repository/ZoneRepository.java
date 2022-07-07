package com.example.projetbackend.repository;

import com.example.projetbackend.model.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer> {

    Zone findByName(String name);

    //ZONE - REGION
    @Query(value = "SELECT * FROM zone z WHERE z.nom_region LIKE :region AND z.id_generation <= :gen" , nativeQuery = true)
    List<Zone> findZoneByRegion(@Param(value = "region") String region, @Param(value = "gen") int gen);

    @Query(value = "SELECT * FROM zone z WHERE z.id_generation <= :gen" , nativeQuery = true)
    List<Zone> findZoneByGen(@Param(value = "gen") int gen);

    //FAMILLE - ZONE
    @Query(value = "SELECT nom_zone FROM regroupement rg WHERE rg.nom_famille LIKE :famille" , nativeQuery = true)
    List<String> findZoneByFamily(@Param(value = "famille") String famille);
}
