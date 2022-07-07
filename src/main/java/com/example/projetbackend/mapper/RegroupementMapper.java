package com.example.projetbackend.mapper;

import com.example.projetbackend.model.dto.RegroupementDTO;
import com.example.projetbackend.model.entity.Regroupement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegroupementMapper {

    @Autowired
    private FamilleMapper familleMapper;

    @Autowired
    private ZoneMapper zoneMapper;

    public RegroupementDTO toDto(Regroupement regroupement) {
        if (regroupement == null) {
            return null;
        }

        RegroupementDTO dto = new RegroupementDTO();
        dto.setId(regroupement.getId());
        dto.setGroup_famille(familleMapper.toDto(regroupement.getGroup_famille()));
        dto.setGroup_zone(zoneMapper.toDto(regroupement.getGroup_zone()));

        return dto;
    }

    public Regroupement toEntity(RegroupementDTO regroupementDTO) {
        if (regroupementDTO == null) {
            return null;
        }

        Regroupement entity = new Regroupement();
        entity.setId(regroupementDTO.getId());
        entity.setGroup_famille(familleMapper.toEntity(regroupementDTO.getGroup_famille()));
        entity.setGroup_zone(zoneMapper.toEntity(regroupementDTO.getGroup_zone()));

        return entity;
    }

}
