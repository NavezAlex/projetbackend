package com.example.projetbackend.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
public class Famille {

    @Id
    @Column(name = "nom_famille", nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "name_type")
    private Type types;

    @Column(name = "exotic_famille")
    private boolean exotic;

    @ManyToOne
    @JoinColumn(name = "id_generation")
    private Generation genes_famille;

    @OneToMany(mappedBy = "familles")
    private List<Creature> creatures_famille;

    @OneToMany(mappedBy = "group_famille")
    private List<Regroupement> familleRegroupement;

    public Famille() {
    }

    public Famille(String name, Type types, boolean exotic) {
        this.name = name;
        this.types = types;
        this.exotic = exotic;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Type getTypes() {
        return types;
    }
    public void setTypes(Type types) {
        this.types = types;
    }

    public boolean isExotic() {
        return exotic;
    }
    public void setExotic(boolean exotic) {
        this.exotic = exotic;
    }

    public Generation getGenes_famille() {
        return genes_famille;
    }
    public void setGenes_famille(Generation genes_famille) {
        this.genes_famille = genes_famille;
    }

    public List<Creature> getCreatures_famille() {
        return creatures_famille;
    }
    public void setCreatures_famille(List<Creature> creatures_famille) {
        this.creatures_famille = creatures_famille;
    }

    public List<Regroupement> getFamilleRegroupement() {
        return familleRegroupement;
    }
    public void setFamilleRegroupement(List<Regroupement> familleRegroupement) {
        this.familleRegroupement = familleRegroupement;
    }

    public void isExotic(boolean exotic) {
    }

}
