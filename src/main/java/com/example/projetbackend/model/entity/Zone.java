package com.example.projetbackend.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zone {

    @Id
    @Column(name = "nom_zone", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "nom_region")
    private Region regions;

    @ManyToOne
    @JoinColumn(name = "id_generation")
    private Generation genes_zone;

    @OneToMany(mappedBy = "group_zone")
    private List<Regroupement> zoneRegroupement;


    public Zone() {
    }

    public Zone(String name, Region regions) {
        this.name = name;
        this.regions = regions;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Region getRegions() {
        return regions;
    }
    public void setRegions(Region regions) {
        this.regions = regions;
    }

    public Generation getGenes_zone() {
        return genes_zone;
    }
    public void setGenes_zone(Generation genes_zone) {
        this.genes_zone = genes_zone;
    }

    public List<Regroupement> getZoneRegroupement() {
        return zoneRegroupement;
    }
    public void setZoneRegroupement(List<Regroupement> zoneRegroupement) {
        this.zoneRegroupement = zoneRegroupement;
    }
}
