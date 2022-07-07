package com.example.projetbackend.service;

import com.example.projetbackend.mapper.RegionMapper;
import com.example.projetbackend.model.dto.RegionDTO;
import com.example.projetbackend.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Autowired
    private RegionMapper regionMapper;

    public RegionDTO save(RegionDTO regionDTO){
        return regionMapper.toDto(
                regionRepository.save(regionMapper.toEntity(regionDTO))
        );
    }

    public Set<RegionDTO> getRegions() {
        return regionRepository.findAll()
                .stream()
                .map(regionMapper::toDto)
                .collect(Collectors.toSet());
    }

    public List<RegionDTO> getRegionsByGen(int gen) {
        return regionRepository.findRegionByGen(gen)
                .stream()
                .map(regionMapper::toDto)
                .collect(Collectors.toList());
    }

    public String deleteRegion(String region) {
        regionRepository.deleteById(region);
        return "Region Supprimée";
    }

}
