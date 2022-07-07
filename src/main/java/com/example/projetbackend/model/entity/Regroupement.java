package com.example.projetbackend.model.entity;

import javax.persistence.*;

@Entity
public class Regroupement {

    @Id
    @Column(name = "id_regroupement")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "nom_famille")
    private Famille group_famille;

    @ManyToOne
    @JoinColumn(name = "nom_zone")
    private Zone group_zone;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Famille getGroup_famille() {
        return group_famille;
    }
    public void setGroup_famille(Famille group_famille) {
        this.group_famille = group_famille;
    }

    public Zone getGroup_zone() {
        return group_zone;
    }
    public void setGroup_zone(Zone group_zone) {
        this.group_zone = group_zone;
    }
}
