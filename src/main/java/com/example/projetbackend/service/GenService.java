package com.example.projetbackend.service;

import com.example.projetbackend.mapper.GenMapper;
import com.example.projetbackend.model.dto.GenerationDTO;
import com.example.projetbackend.repository.GenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class GenService {

    @Autowired
    private GenRepository genRepository;

    @Autowired
    private GenMapper genMapper;


    public GenerationDTO save(GenerationDTO generationDTO) {
        return genMapper.toDto(
                genRepository.save(genMapper.toEntity(generationDTO))
        );
    }

    public Set<GenerationDTO> getGens() {
        return genRepository.findAll()
                .stream()
                .map(genMapper::toDto)
                .collect(Collectors.toSet());
    }

    public GenerationDTO getGenById(int id) {
        return genMapper.toDto(
                genRepository.findById(id).orElse(null)
        );
    }

    public String deleteGen(int id) {
        genRepository.deleteById(id);
        return "Generation deleted";
    }
}
