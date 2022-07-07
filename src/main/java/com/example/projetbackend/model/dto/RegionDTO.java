package com.example.projetbackend.model.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class RegionDTO {
    private String name;

    @JsonIgnore
    private GenerationDTO genes;

        public int gene_id;

        public int getGene_id() {
            return genes.getId();
        }

//    @JsonIgnore
//    private List<ZoneDTO> zones;
//        private List<String> zoneNames;
//
//        public List<String> getZoneNames() {
//            List<String> rNames = new ArrayList<>();
//            for(ZoneDTO zoneDTO : zones){
//                rNames.add(zoneDTO.getName());
//            }
//            return rNames;
//        }


    public RegionDTO() {
    }

//    public RegionDTO(String name, GenerationDTO genes, List<ZoneDTO> zones) {
    public RegionDTO(String name, GenerationDTO genes) {
        this.name = name;
        this.genes = genes;
//        this.zones = zones;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public GenerationDTO getGenes() {
        return genes;
    }
    public void setGenes(GenerationDTO genes) {
        this.genes = genes;
    }

//    public List<ZoneDTO> getZones() {
//        return zones;
//    }
//    public void setZones(List<ZoneDTO> zones) {
//        this.zones = zones;
//    }

    @Override
    public String toString() {
        return "RegionDTO{" +
                "name='" + name + '\'' +
                ", genes=" + genes +
                //", zones=" + zones +
                '}';
    }
}
