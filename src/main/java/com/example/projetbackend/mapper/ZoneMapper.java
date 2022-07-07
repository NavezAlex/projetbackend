package com.example.projetbackend.mapper;

import com.example.projetbackend.model.dto.ZoneDTO;
import com.example.projetbackend.model.entity.Zone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneMapper {

    @Autowired
    private RegionMapper regionMapper;

    @Autowired
    private GenMapper genMapper;

//    @Autowired
//    private RegroupementMapper regroupementMapper;

    public ZoneDTO toDto(Zone zone) {
        if (zone == null) {
            return null;
        }

        ZoneDTO dto = new ZoneDTO();
        dto.setName(zone.getName());
        dto.setRegions(regionMapper.toDto(zone.getRegions()));
        dto.setGenes_zone(genMapper.toDto(zone.getGenes_zone()));
//        dto.setZoneRegroupement(zone.getZoneRegroupement()
//                .stream()
//                .map(regroupementMapper::toDto)
//                .collect(Collectors.toList())
//        );

        return dto;
    }

    public Zone toEntity(ZoneDTO zoneDTO) {
        if (zoneDTO == null) {
            return null;
        }

        Zone entity = new Zone();
        entity.setName(zoneDTO.getName());
        entity.setRegions(regionMapper.toEntity(zoneDTO.getRegions()));
//        entity.setZoneRegroupement(zoneDTO.getZoneRegroupement()
//                .stream()
//                .map(regroupementMapper::toEntity)
//                .collect(Collectors.toList())
//        );

        return entity;
    }

}
