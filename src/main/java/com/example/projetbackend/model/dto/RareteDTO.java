package com.example.projetbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class RareteDTO {
    private String name;

    private int niveau;

//    @JsonIgnore
//    private List<CreatureDTO> creatures;
//
//        private List<Integer> creatureIds;
//
//        public List<Integer> getCreatureIds() {
//            List<Integer> ids = new ArrayList<>();
//            for (CreatureDTO creatureDTO : creatures) {
//                ids.add(creatureDTO.getId());
//            }
//            return ids;
//        }


    public RareteDTO() {
    }

    public RareteDTO(String name, int niveau) {
        this.name = name;
        this.niveau = niveau;
    }


//    public RareteDTO(String name, int niveau, List<CreatureDTO> creatures) {
//        this.name = name;
//        this.niveau = niveau;
//        this.creatures = creatures;
//    }

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

//    public List<CreatureDTO> getCreatures() {
//        return creatures;
//    }
//    public void setCreatures(List<CreatureDTO> creatures) {
//        this.creatures = creatures;
//    }

    @Override
    public String toString() {
        return "RareteDTO{" +
                "name='" + name + '\'' +
                ", niveau=" + niveau +
                //", creatures=" + creatures +
                '}';
    }
}
