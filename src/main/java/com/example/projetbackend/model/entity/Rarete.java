package com.example.projetbackend.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Rarete {

    @Id
    @Column(name = "niveau_rarete", columnDefinition = "int(11) default '0'", nullable = false, unique = true)
    private int niveau;

    @Column(name = "nom_rarete", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "rare")
    private List<Creature> creatures;

    public Rarete() {
    }

    public Rarete(String name, int niveau) {
        this.name = name;
        this.niveau = niveau;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public List<Creature> getCreatures() {
        return creatures;
    }
    public void setCreatures(List<Creature> creatures) {
        this.creatures = creatures;
    }
}
