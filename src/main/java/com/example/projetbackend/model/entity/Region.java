package com.example.projetbackend.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Region {
    @Id
    @Column(name = "nom_region")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_generation")
    private Generation genes;

    @OneToMany(mappedBy = "regions")
    private List<Zone> zones;

    public Region() {
    }

    public Region(String name, Generation genes) {
        this.name = name;
        this.genes = genes;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Generation getGenes() {
        return genes;
    }
    public void setGenes(Generation genes) {
        this.genes = genes;
    }

    public List<Zone> getZones() {
        return zones;
    }
    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }
}
