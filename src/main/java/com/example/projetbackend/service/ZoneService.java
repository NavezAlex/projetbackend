package com.example.projetbackend.service;

import com.example.projetbackend.mapper.ZoneMapper;
import com.example.projetbackend.model.dto.ZoneDTO;
import com.example.projetbackend.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ZoneService {

    @Autowired
    private ZoneRepository zoneRepository;

    @Autowired
    private ZoneMapper zoneMapper;

    public ZoneDTO save(ZoneDTO zoneDTO) {
        return zoneMapper.toDto(
                zoneRepository.save(zoneMapper.toEntity(zoneDTO))
        );
    }

    public Set<ZoneDTO> getZones() {
        return zoneRepository.findAll()
                .stream()
                .map(zoneMapper::toDto)
                .collect(Collectors.toSet());
    }

    public ZoneDTO getZoneByName(String name) {
        return zoneMapper.toDto(
                zoneRepository.findByName(name)
        );
    }

    public List<ZoneDTO> getZonesByGen(int gen) {
        return zoneRepository.findZoneByGen(gen)
                .stream()
                .map(zoneMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<ZoneDTO> getZonesByRegion(String zone, int gen) {
        return zoneRepository.findZoneByRegion(zone, gen)
                .stream()
                .map(zoneMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<String> getZonesByFamily(String famille) {
        return zoneRepository.findZoneByFamily(famille);
    }

    public String deleteZone(int id) {
        zoneRepository.deleteById(id);
        return "Zone Supprimée";
    }

}
