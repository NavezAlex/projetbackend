package com.example.projetbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class TypeDTO {
    private int id;

    private String name;

//    @JsonIgnore
//    private List<FamilleDTO> familles;
//
//    private List<String> familleNames;
//
//        public List<String> getFamilleNames() {
//            List<String> rNames = new ArrayList<>();
//            for(FamilleDTO familleDTO : familles){
//                rNames.add(familleDTO.getName());
//            }
//            return rNames;
//        }


    public TypeDTO() {
    }

//    public TypeDTO(int id, String name , List<FamilleDTO> familles) {
    public TypeDTO(int id, String name) {
        this.id = id;
        this.name = name;
//        this.familles = familles;
    }

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

//    public List<FamilleDTO> getFamilles() {
//        return familles;
//    }
//    public void setFamilles(List<FamilleDTO> familles) {
//        this.familles = familles;
//    }

    @Override
    public String toString() {
        return "TypeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                //", familles=" + familles +
                '}';
    }
}
