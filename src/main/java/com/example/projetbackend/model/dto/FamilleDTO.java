package com.example.projetbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FamilleDTO {

    public String name_famille;

    @JsonIgnore
    private TypeDTO types;

        public String name_type;

        public String getName_type() {
            return types.getName();
        }

    public boolean exotic;

    @JsonIgnore
    private GenerationDTO genes_famille;

        public int gene_id;

        public int getGene_id() {
            return genes_famille.getId();
        }

//    @JsonIgnore
//    private List<CreatureDTO> creatures_famille;
//
//        private List<Integer> creatureIds;
//
//        public List<Integer> getCreatureIds() {
//            List<Integer> ids = new ArrayList<>();
//            for (CreatureDTO creatureDTO : creatures_famille) {
//                ids.add(creatureDTO.getId());
//            }
//            return ids;
//        }

//    @JsonIgnore
//    private List<RegroupementDTO> familleRegroupement;
//
//        private List<Integer> familleZoneIds;
//
//        public List<Integer> getFamilleZoneIds(){
//            List<Integer> ids = new ArrayList<>();
//            for (RegroupementDTO regroupementDTO : familleRegroupement) {
//                ids.add(regroupementDTO.getId());
//            }
//            return ids;
//        }


    public FamilleDTO() {
    }

//    public FamilleDTO(String name, TypeDTO types, boolean exotic, GenerationDTO genes_famille, List<CreatureDTO> creatures_famille, List<RegroupementDTO> familleRegroupement) {
    public FamilleDTO(String name, TypeDTO types, boolean exotic, GenerationDTO genes_famille) {
        this.name_famille = name;
        this.types = types;
        this.exotic = exotic;
        this.genes_famille = genes_famille;
        //this.creatures_famille = creatures_famille;
        //this.familleRegroupement = familleRegroupement;
    }

    public FamilleDTO(String name, TypeDTO types) {
        this.name_famille = name;
        this.types = types;
    }

    public String getName() {
        return name_famille;
    }
    public void setName(String name) {
        this.name_famille = name;
    }

    public TypeDTO getTypes() {
        return types;
    }
    public void setTypes(TypeDTO types) {
        this.types = types;
    }

    public boolean isExotic() {
        return this.exotic;
    }
    public void setExotic(boolean exotic) {
        this.exotic = exotic;
    }

    public GenerationDTO getGenes_famille() {
        return genes_famille;
    }
    public void setGenes_famille(GenerationDTO genes_famille) {
        this.genes_famille = genes_famille;
    }

//    public List<CreatureDTO> getCreatures_famille() {
//        return creatures_famille;
//    }
//    public void setCreatures_famille(List<CreatureDTO> creatures_famille) {
//        this.creatures_famille = creatures_famille;
//    }

//    public List<RegroupementDTO> getFamilleRegroupement() {
//        return familleRegroupement;
//    }
//    public void setFamilleRegroupement(List<RegroupementDTO> familleRegroupement) {
//        this.familleRegroupement = familleRegroupement;
//    }

    @Override
    public String toString() {
        return "FamilleDTO{" +
                "name='" + name_famille + '\'' +
                ", types=" + types +
                ", exotic=" + exotic +
                ", genes_famille=" + genes_famille +
                //", creatures_famille=" + creatures_famille +
                //", familleRegroupement=" + familleRegroupement +
                '}';
    }
}
