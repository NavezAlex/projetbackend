package com.example.projetbackend.mapper;

import com.example.projetbackend.model.dto.CreatureDTO;
import com.example.projetbackend.model.dto.FamilleDTO;
import com.example.projetbackend.model.dto.GenerationDTO;
import com.example.projetbackend.model.dto.RareteDTO;
import com.example.projetbackend.model.entity.Creature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatureMapper {

    @Autowired
    private FamilleMapper familleMapper;

    @Autowired
    private GenMapper genMapper;

    @Autowired
    private RareteMapper rareteMapper;


    public CreatureDTO toDto(Creature creature) {
        if (creature == null) {
            return null;
        }

        CreatureDTO dto = new CreatureDTO();
        dto.setId(creature.getId());
        dto.setNom_Famille(creature.getFamilles().getName());
        dto.setName(creature.getName());
        dto.setGene_id(creature.getGenes_creature().getId());
        dto.setRare_niveau(creature.getRare().getNiveau());

        return dto;
    }

    public Creature toEntity(FamilleDTO familleDTO,CreatureDTO creatureDTO, GenerationDTO generationDTO, RareteDTO rareteDTO) {
        if (creatureDTO == null) {
            return null;
        }

        Creature entity = new Creature();
        entity.setId(creatureDTO.getId());
        entity.setFamilles(familleMapper.toEntity(familleDTO));
        entity.setName(creatureDTO.getName());
        entity.setGenes_creature(genMapper.toEntity(generationDTO));
        entity.setRare(rareteMapper.toEntity(rareteDTO));

        return entity;
    }

}
