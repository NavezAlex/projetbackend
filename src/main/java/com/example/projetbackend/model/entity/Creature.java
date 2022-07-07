package com.example.projetbackend.model.entity;

import javax.persistence.*;

@Entity
public class Creature {

    @Id
    @Column(name = "id_creature")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "nom_famille")
    private Famille familles;

    @Column(name = "nom_creature")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_generation")
    private Generation genes_creature;

    @ManyToOne
    @JoinColumn(name = "niveau_rarete")
    private Rarete rare;

    public Creature() {
    }

    public Creature(int id, Famille familles, String name, Generation genes_creature, Rarete rare) {
        this.id = id;
        this.familles = familles;
        this.name = name;
        this.genes_creature = genes_creature;
        this.rare = rare;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Famille getFamilles() {
        return familles;
    }
    public void setFamilles(Famille familles) {
        this.familles = familles;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Generation getGenes_creature() {
        return genes_creature;
    }
    public void setGenes_creature(Generation genes_creature) {
        this.genes_creature = genes_creature;
    }

    public Rarete getRare() {
        return rare;
    }
    public void setRare(Rarete rare) {
        this.rare = rare;
    }
}
