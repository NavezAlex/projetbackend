package com.example.projetbackend.mapper;


import com.example.projetbackend.model.dto.FamilleDTO;
import com.example.projetbackend.model.entity.Famille;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilleMapper {

    @Autowired
    private TypeMapper typeMapper;

    @Autowired
    private GenMapper genMapper;

//    @Autowired
//    private CreatureMapper creatureMapper;

//    @Autowired
//    private RegroupementMapper regroupementMapper;


    public FamilleDTO toDto(Famille famille) {
        if (famille == null) {
            return null;
        }

        FamilleDTO dto = new FamilleDTO();
        dto.setName(famille.getName());
        dto.setTypes(typeMapper.toDto(famille.getTypes()));
        dto.setExotic(famille.isExotic());
        dto.setGenes_famille(genMapper.toDto(famille.getGenes_famille()));
//        dto.setCreatures_famille(famille.getCreatures_famille()
//                .stream()
//                .map(creatureMapper::toDto)
//                .collect(Collectors.toList())
//        );
//        dto.setFamilleRegroupement(famille.getFamilleRegroupement()
//                .stream()
//                .map(regroupementMapper::toDto)
//                .collect(Collectors.toList())
//        );

        return dto;
    }

    public Famille toEntity(FamilleDTO familleDTO) {
        if (familleDTO == null) {
            return null;
        }

        Famille entity = new Famille();
        entity.setName(familleDTO.getName());
        entity.setTypes(typeMapper.toEntity(familleDTO.getTypes()));
        entity.isExotic(familleDTO.isExotic());
        entity.setGenes_famille(genMapper.toEntity(familleDTO.getGenes_famille()));
//        entity.setCreatures_famille(familleDTO.getCreatures_famille()
//                .stream()
//                .map(creatureMapper::toEntity)
//                .collect(Collectors.toList())
//        );
//        entity.setFamilleRegroupement(familleDTO.getFamilleRegroupement()
//                .stream()
//                .map(regroupementMapper::toEntity)
//                .collect(Collectors.toList())
//        );

        return entity;
    }

}
