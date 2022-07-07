package com.example.projetbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ZoneDTO {

    public String name_zone;

    @JsonIgnore
    private RegionDTO regions;

        public String regionNames;

        public String getRegionNames() {
            return regions.getName();
        }

    @JsonIgnore
    private GenerationDTO genes_zone;

        public int gene_id;

        public int getGene_id() {
            return genes_zone.getId();
        }

//    @JsonIgnore
//    private List<RegroupementDTO> zoneRegroupement;
//        private List<Integer> zoneFamilleIds;
//
//        public List<Integer> getZoneFamilleIds(){
//            List<Integer> ids = new ArrayList<>();
//            for (RegroupementDTO regroupementDTO : zoneRegroupement) {
//                ids.add(regroupementDTO.getId());
//            }
//            return ids;
//        }


    public ZoneDTO() {
    }

    //public ZoneDTO(int id, String name, RegionDTO regions, GenerationDTO genes_zone, List<RegroupementDTO> zoneRegroupement) {
    public ZoneDTO(String name, RegionDTO regions, GenerationDTO genes_zone) {
        this.name_zone = name;
        this.regions = regions;
        this.genes_zone = genes_zone;
        //this.zoneRegroupement = zoneRegroupement;
    }

    public String getName() {
        return name_zone;
    }
    public void setName(String name) {
        this.name_zone = name;
    }

    public RegionDTO getRegions() {
        return regions;
    }
    public void setRegions(RegionDTO regions) {
        this.regions = regions;
    }

    public GenerationDTO getGenes_zone() {
        return genes_zone;
    }
    public void setGenes_zone(GenerationDTO genes_zone) {
        this.genes_zone = genes_zone;
    }

//    public List<RegroupementDTO> getZoneRegroupement() {
//        return zoneRegroupement;
//    }
//    public void setZoneRegroupement(List<RegroupementDTO> zoneRegroupement) {
//        this.zoneRegroupement = zoneRegroupement;
//    }

    @Override
    public String toString() {
        return "ZoneDTO{" +
                ", name_zone='" + name_zone + '\'' +
                ", regions=" + regions +
                ", genes_zone=" + genes_zone +
                //", zoneRegroupement=" + zoneRegroupement +
                '}';
    }
}
