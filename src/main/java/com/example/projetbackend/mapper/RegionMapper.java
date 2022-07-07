package com.example.projetbackend.mapper;


import com.example.projetbackend.model.dto.RegionDTO;
import com.example.projetbackend.model.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionMapper {

    @Autowired
    private GenMapper genMapper;

//    @Autowired
//    private ZoneMapper zoneMapper;

    public RegionDTO toDto(Region region) {
        if (region == null) {
            return null;
        }

        RegionDTO dto = new RegionDTO();
        dto.setName(region.getName());
        dto.setGenes(genMapper.toDto(region.getGenes()));
//        dto.setZones(region.getZones()
//                .stream()
//                .map(zoneMapper::toDto)
//                .collect(Collectors.toList())
//        );

        return dto;
    }

    public Region toEntity(RegionDTO regionDTO) {
        if (regionDTO == null) {
            return null;
        }

        Region entity = new Region();
        entity.setName(regionDTO.getName());
        entity.setGenes(genMapper.toEntity(regionDTO.getGenes()));
//        entity.setZones(regionDTO.getZones()
//                .stream()
//                .map(zoneMapper::toEntity)
//                .collect(Collectors.toList())
//        );

        return entity;
    }

}
