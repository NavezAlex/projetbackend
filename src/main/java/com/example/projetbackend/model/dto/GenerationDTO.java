package com.example.projetbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class GenerationDTO {

    private int id;

    private String name;

//    @JsonIgnore
//    private List<RegionDTO> regions_gene;
//
//        private List<String> regionNames;
//
//        public List<String> getRegionNames() {
//            List<String> rNames = new ArrayList<>();
//            for(RegionDTO regionDTO : regions_gene){
//                rNames.add(regionDTO.getName());
//            }
//            return rNames;
//        }
//
//    @JsonIgnore
//    private List<CreatureDTO> creatures_gene;
//
//        private List<Integer> creatureIds;
//
//        public List<Integer> getCreatureIds() {
//            List<Integer> ids = new ArrayList<>();
//            for (CreatureDTO creatureDTO : creatures_gene) {
//                ids.add(creatureDTO.getId());
//            }
//            return ids;
//        }
//
//    @JsonIgnore
//    private List<FamilleDTO> familles_gene;
//
//        private List<String> familleNames;
//
//        public List<String> getFamilleNames() {
//            List<String> rNames = new ArrayList<>();
//            for(FamilleDTO familleDTO : familles_gene){
//                rNames.add(familleDTO.getName());
//            }
//            return rNames;
//        }
//
//    @JsonIgnore
//    private List<ZoneDTO> genes_zone;
//
//        private List<String> zoneNames;
//
//        public List<String> getZoneNames() {
//            List<String> rNames = new ArrayList<>();
//            for(ZoneDTO zoneDTO : genes_zone){
//                rNames.add(zoneDTO.getName());
//            }
//            return rNames;
//        }

    public GenerationDTO() {
    }

    public GenerationDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    public GenerationDTO(int id, String name, List<RegionDTO> regions_gene, List<CreatureDTO> creatures_gene, List<FamilleDTO> familles_gene, List<ZoneDTO> genes_zone) {
//        this.id = id;
//        this.name = name;
//        this.regions_gene = regions_gene;
//        this.creatures_gene = creatures_gene;
//        this.familles_gene = familles_gene;
//        this.genes_zone = genes_zone;
//    }

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

//    public List<RegionDTO> getRegions_gene() {
//        return regions_gene;
//    }
//    public void setRegions_gene(List<RegionDTO> regions_gene) {
//        this.regions_gene = regions_gene;
//    }
//
//    public List<CreatureDTO> getCreatures_gene() {
//        return creatures_gene;
//    }
//    public void setCreatures_gene(List<CreatureDTO> creatures_gene) {
//        this.creatures_gene = creatures_gene;
//    }
//
//    public List<FamilleDTO> getFamilles_gene() {
//        return familles_gene;
//    }
//    public void setFamilles_gene(List<FamilleDTO> familles_gene) {
//        this.familles_gene = familles_gene;
//    }
//
//    public List<ZoneDTO> getGenes_zone() {
//        return genes_zone;
//    }
//    public void setGenes_zone(List<ZoneDTO> genes_zone) {
//        this.genes_zone = genes_zone;
//    }

    @Override
    public String toString() {
        return "GenerationDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
//                ", regions_gene=" + regions_gene +
//                ", creatures_gene=" + creatures_gene +
//                ", familles_gene=" + familles_gene +
//                ", genes_zone=" + genes_zone +
                '}';
    }
}
