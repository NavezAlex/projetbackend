package com.example.projetbackend.mapper;

import com.example.projetbackend.model.dto.RareteDTO;
import com.example.projetbackend.model.entity.Rarete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;


@Service
public class RareteMapper {

//    @Autowired
//    private CreatureMapper creatureMapper;

    public RareteDTO toDto(Rarete rarete) {
        if (rarete == null) {
            return null;
        }

        RareteDTO dto = new RareteDTO();
        dto.setName(rarete.getName());
        dto.setNiveau(rarete.getNiveau());
//        dto.setCreatures(rarete.getCreatures()
//                .stream()
//                .map(creatureMapper::toDto)
//                .collect(Collectors.toList())
//        );

        return dto;
    }

    public Rarete toEntity(RareteDTO rareteDTO) {
        if (rareteDTO == null) {
            return null;
        }

        Rarete entity = new Rarete();
        entity.setName(rareteDTO.getName());
        entity.setNiveau(rareteDTO.getNiveau());
//        entity.setCreatures(rareteDTO.getCreatures()
//                .stream()
//                .map(creatureMapper::toEntity)
//                .collect(Collectors.toList())
//        );

        return entity;
    }

}
