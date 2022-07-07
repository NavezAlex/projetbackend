package com.example.projetbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CreatureDTO {

    private int id;

    //    @JsonIgnore
//    private FamilleDTO familles;

    private String nom_Famille;

    private String name;

//    @JsonIgnore
//    private GenerationDTO genes_creature;

    private int gene_id;

//    @JsonIgnore
//    private RareteDTO rare;

    private int rare_niveau;


    public CreatureDTO() {
    }

    public CreatureDTO(int id, String familles, String name, int genes_creature, int rare) {
        this.id = id;
        this.nom_Famille = familles;
        this.name = name;
        this.gene_id = genes_creature;
        this.rare_niveau = rare;
    }

    public CreatureDTO(String familles, String name, int genes_creature, int rare) {
        this.nom_Famille = familles;
        this.name = name;
        this.gene_id = genes_creature;
        this.rare_niveau = rare;
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

    public String getNom_Famille() {
        return nom_Famille;
    }

    public void setNom_Famille(String nom_Famille) {
        this.nom_Famille = nom_Famille;
    }

    public int getGene_id() {
        return gene_id;
    }

    public void setGene_id(int gene_id) {
        this.gene_id = gene_id;
    }

    public int getRare_niveau() {
        return rare_niveau;
    }

    public void setRare_niveau(int rare_niveau) {
        this.rare_niveau = rare_niveau;
    }



    @Override
    public String toString() {
        return "CreatureDTO{" +
                "id=" + id +
                ", familles=" + nom_Famille +
                ", name='" + name + '\'' +
                ", genes_creature=" + gene_id +
                ", rare=" + rare_niveau +
                '}';
    }
}
