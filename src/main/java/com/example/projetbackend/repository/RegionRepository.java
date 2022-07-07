package com.example.projetbackend.repository;

import com.example.projetbackend.model.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, String> {
    Region findByName(String name);

    @Query(value = "SELECT * FROM region r WHERE r.id_generation <= :gen" , nativeQuery = true)
    List<Region> findRegionByGen(@Param(value = "gen") int gen);
}
