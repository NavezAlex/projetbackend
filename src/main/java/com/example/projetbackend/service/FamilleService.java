package com.example.projetbackend.service;

import com.example.projetbackend.mapper.FamilleMapper;
import com.example.projetbackend.model.dto.FamilleDTO;
import com.example.projetbackend.repository.FamilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FamilleService {

    @Autowired
    private FamilleRepository familleRepository;

    @Autowired
    private FamilleMapper familleMapper;


    public FamilleDTO save(FamilleDTO familleDTO) {
        return familleMapper.toDto(
                familleRepository.save(familleMapper.toEntity(familleDTO))
        );
    }

    public Set<FamilleDTO> getFamilles() {
        return familleRepository.findAll()
                .stream()
                .map(familleMapper::toDto)
                .collect(Collectors.toSet());
    }

    public List<FamilleDTO> getFamilleByName(String name) {
        return familleRepository.findByName(name)
                .stream()
                .map(familleMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<FamilleDTO> getFamillesExotic(int gen) {
        return familleRepository.findFamilyExotic(gen)
                .stream()
                .map(familleMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<FamilleDTO> getFamillesByGen(int gen) {
        return familleRepository.findFamilyByGen(gen)
                .stream()
                .map(familleMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<FamilleDTO> getFamillesByType(String type, int gen) {
        return familleRepository.findFamilyByType(type, gen)
                .stream()
                .map(familleMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<FamilleDTO> getFamilyExoticByType(String type, int gen) {
        return familleRepository.findFamilyExoticByType(type, gen)
                .stream()
                .map(familleMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<String> getFamillesByZone(String zone) {
        return familleRepository.findFamilyByZone(zone);
    }

    public String deleteCreature(String name) {
        familleRepository.deleteById(name);
        return "Famille Supprimée";
    }

}
