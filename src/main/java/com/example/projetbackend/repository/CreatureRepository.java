package com.example.projetbackend.repository;

import com.example.projetbackend.model.entity.Famille;
import com.example.projetbackend.model.entity.Generation;
import com.example.projetbackend.model.entity.Rarete;
import com.example.projetbackend.model.entity.Creature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CreatureRepository extends JpaRepository<Creature, Integer> {

    //CREATURE BY NAME
    //@Query(value = "SELECT * FROM creature c WHERE c.nom_creature LIKE :name" , nativeQuery = true)
    //List<Creature> findCreatureByName(@Param(value = "name") String name);
    List<Creature> findByName(String name);


    //FAMILLE - CREATURE
    @Query(value = "SELECT * FROM creature c WHERE c.nom_famille LIKE :famille AND c.id_generation <= :gen" , nativeQuery = true)
    List<Creature> findCreatureByFamille(@Param(value = "famille") String famille, @Param(value= "gen") int gen);

    //CREATURE - RARETE
    @Query(value = "SELECT * FROM creature c WHERE c.niveau_rarete = :rare AND c.id_generation <= :gen" , nativeQuery = true)
    List<Creature> findCreatureByRarity(@Param(value = "rare") int rare, @Param(value= "gen") int gen);


    //FAMILLE - CREATURE - RARETE
    @Query(value = "SELECT * FROM creature c WHERE c.nom_famille LIKE :famille AND c.niveau_rarete = :rare AND c.id_generation <= :gen" , nativeQuery = true)
    List<Creature> findCreatureByFamilleRare(@Param(value = "famille") String famille, @Param(value = "rare") int rare, @Param(value= "gen") int gen);


    @Query(value = "SELECT * FROM creature c WHERE c.id_generation <= :gen" , nativeQuery = true)
    List<Creature> findCreatureByGen(@Param(value = "gen") int gen);

}
