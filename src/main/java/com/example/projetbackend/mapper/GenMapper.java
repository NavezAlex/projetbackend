package com.example.projetbackend.mapper;

import com.example.projetbackend.model.dto.GenerationDTO;
import com.example.projetbackend.model.entity.Generation;
import org.springframework.stereotype.Service;

@Service
public class GenMapper {

//    @Autowired
//    private RegionMapper regionMapper;
//
//    @Autowired
//    private CreatureMapper creatureMapper;
//
//    @Autowired
//    private FamilleMapper familleMapper;
//
//    @Autowired
//    private ZoneMapper zoneMapper;

    public GenerationDTO toDto(Generation generation) {
        if (generation == null) {
            return null;
        }

        GenerationDTO dto = new GenerationDTO();
        dto.setId(generation.getId());
        dto.setName(generation.getName());
//        dto.setRegions_gene(generation.getRegions_gene()
//                .stream()
//                .map(regionMapper::toDto)
//                .collect(Collectors.toList())
//        );
//        dto.setCreatures_gene(generation.getCreatures_gene()
//                .stream()
//                .map(creatureMapper::toDto)
//                .collect(Collectors.toList())
//        );
//        dto.setFamilles_gene(generation.getFamilles_gene()
//                .stream()
//                .map(familleMapper::toDto)
//                .collect(Collectors.toList())
//        );
//        dto.setGenes_zone(generation.getGenes_zone()
//                .stream()
//                .map(zoneMapper::toDto)
//                .collect(Collectors.toList())
//        );

        return dto;
    }

    public Generation toEntity(GenerationDTO generationDTO) {
        if (generationDTO == null) {
            return null;
        }

        Generation entity = new Generation();
        entity.setId(generationDTO.getId());
        entity.setName(generationDTO.getName());
//        entity.setRegions_gene(generationDTO.getRegions_gene()
//                .stream()
//                .map(regionMapper::toEntity)
//                .collect(Collectors.toList())
//        );
//        entity.setCreatures_gene(generationDTO.getCreatures_gene()
//                .stream()
//                .map(creatureMapper::toEntity)
//                .collect(Collectors.toList())
//        );
//        entity.setFamilles_gene(generationDTO.getFamilles_gene()
//                .stream()
//                .map(familleMapper::toEntity)
//                .collect(Collectors.toList())
//        );
//        entity.setGenes_zone(generationDTO.getGenes_zone()
//                .stream()
//                .map(zoneMapper::toEntity)
//                .collect(Collectors.toList())
//        );

        return entity;
    }

}
