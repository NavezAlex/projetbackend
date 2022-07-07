package com.example.projetbackend.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Generation {

    @Id
    @Column(name = "id_generation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_generation")
    private String name;

    @OneToMany(mappedBy = "genes")
    private List<Region> regions_gene;

    @OneToMany(mappedBy = "genes_creature")
    private List<Creature> creatures_gene;

    @OneToMany(mappedBy = "genes_famille")
    private List<Famille> familles_gene;

    @OneToMany(mappedBy = "genes_zone")
    private List<Zone> genes_zone;

    public Generation() {
    }

    public Generation(String name) {
        this.name = name;
    }

    public Generation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Region> getRegions_gene() {
        return regions_gene;
    }
    public void setRegions_gene(List<Region> regions_gene) {
        this.regions_gene = regions_gene;
    }

    public List<Creature> getCreatures_gene() {
        return creatures_gene;
    }
    public void setCreatures_gene(List<Creature> creatures_gene) {
        this.creatures_gene = creatures_gene;
    }

    public List<Famille> getFamilles_gene() {
        return familles_gene;
    }
    public void setFamilles_gene(List<Famille> familles_gene) {
        this.familles_gene = familles_gene;
    }

    public List<Zone> getGenes_zone() {
        return genes_zone;
    }
    public void setGenes_zone(List<Zone> genes_zone) {
        this.genes_zone = genes_zone;
    }
}
