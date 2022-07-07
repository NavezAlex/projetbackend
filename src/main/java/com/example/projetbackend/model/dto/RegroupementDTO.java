package com.example.projetbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RegroupementDTO {

    private int id;

    @JsonIgnore
    private FamilleDTO group_famille;

        public String nom_Famille;

        public String getNom_Famille() {
            return group_famille.getName();
        }

    @JsonIgnore
    private ZoneDTO group_zone;

        public String nom_Zone;

        public String getNom_Zone() {
            return group_zone.getName();
        }


    public RegroupementDTO() {
    }

    public RegroupementDTO(int id, FamilleDTO group_famille, ZoneDTO group_zone) {
        this.id = id;
        this.group_famille = group_famille;
        this.group_zone = group_zone;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public FamilleDTO getGroup_famille() {
        return group_famille;
    }
    public void setGroup_famille(FamilleDTO group_famille) {
        this.group_famille = group_famille;
    }

    public ZoneDTO getGroup_zone() {
        return group_zone;
    }
    public void setGroup_zone(ZoneDTO group_zone) {
        this.group_zone = group_zone;
    }

    @Override
    public String toString() {
        return "RegroupementDTO{" +
                "id=" + id +
                ", group_famille=" + group_famille +
                ", group_zone=" + group_zone +
                '}';
    }
}
