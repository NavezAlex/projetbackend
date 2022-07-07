package com.example.projetbackend.service;

import com.example.projetbackend.mapper.CreatureMapper;
import com.example.projetbackend.mapper.FamilleMapper;
import com.example.projetbackend.mapper.GenMapper;
import com.example.projetbackend.mapper.RareteMapper;
import com.example.projetbackend.model.dto.CreatureDTO;
import com.example.projetbackend.model.dto.FamilleDTO;
import com.example.projetbackend.model.dto.GenerationDTO;
import com.example.projetbackend.model.dto.RareteDTO;
import com.example.projetbackend.model.entity.Creature;
import com.example.projetbackend.model.entity.Famille;
import com.example.projetbackend.model.entity.Generation;
import com.example.projetbackend.model.entity.Rarete;
import com.example.projetbackend.repository.CreatureRepository;
import com.example.projetbackend.repository.FamilleRepository;
import com.example.projetbackend.repository.GenRepository;
import com.example.projetbackend.repository.RareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CreatureService {

    @Autowired
    private CreatureRepository creatureRepository;
    @Autowired
    private FamilleRepository familleRepository;
    @Autowired
    private GenRepository genRepository;
    @Autowired
    private RareRepository rareRepository;

    @Autowired
    private CreatureMapper creatureMapper;

    @Autowired
    private FamilleMapper familleMapper;
    @Autowired
    private GenMapper genMapper;
    @Autowired
    private RareteMapper rareteMapper;


    public Set<CreatureDTO> getCreatures() {
        return creatureRepository.findAll()
                .stream()
                .map(creatureMapper::toDto)
                .collect(Collectors.toSet());
    }

    public CreatureDTO getCreatureById(int id) {
        return creatureMapper.toDto(
                creatureRepository.findById(id).orElse(null)
        );
    }

    public List<CreatureDTO> getCreaturesByName(String name) {
        return creatureRepository.findByName(name)
                .stream()
                .map(creatureMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<CreatureDTO> getCreaturesByFamilly(String famille, int gen) {
        return creatureRepository.findCreatureByFamille(famille, gen)
                .stream()
                .map(creatureMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<CreatureDTO> findCreatureByFamilleRare(String famille, int rare, int gen) {
        return creatureRepository.findCreatureByFamilleRare(famille, rare, gen)
                .stream()
                .map(creatureMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<CreatureDTO> getCreaturesByRarity(int rare, int gen) {
        return creatureRepository.findCreatureByRarity(rare, gen)
                .stream()
                .map(creatureMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<CreatureDTO> getCreaturesByGen(int gen) {
        return creatureRepository.findCreatureByGen(gen)
                .stream()
                .map(creatureMapper::toDto)
                .collect(Collectors.toList());
    }


    public FamilleDTO getFamilleC(String fname) {
        Famille famille = familleRepository.findFamilleC(fname);
        return familleMapper.toDto(famille);
    }

    public GenerationDTO getGenC(int gen){
        Generation generation = genRepository.findGenC(gen);
        return genMapper.toDto(generation);
    }

    public RareteDTO getRareC(int rare) {
        Rarete rarete = rareRepository.findRareC(rare);
        return rareteMapper.toDto(rarete);
    }


    public CreatureDTO save(CreatureDTO creatureDTO) {

        Creature creature = creatureRepository.save(creatureMapper.toEntity(
                getFamilleC(creatureDTO.getNom_Famille()),
                creatureDTO,
                getGenC(creatureDTO.getGene_id()),
                getRareC(creatureDTO.getRare_niveau())
        ));
        return creatureMapper.toDto(creature);
    }

    public CreatureDTO updateCreature(int id , CreatureDTO creatureDTO) {
            Creature current = creatureRepository.findById(id).orElse(null);
        if (current != null) {

            if (creatureDTO.getName() != null) {
                current.setName(creatureDTO.getName());
            }
            else{
                current.setName(current.getName());
            }

            if (creatureDTO.getNom_Famille() != null) {
                current.setFamilles(familleRepository.findFamilleC(creatureDTO.getNom_Famille()));
            }
            else{
                current.setFamilles(current.getFamilles());
            }

            if (creatureDTO.getGene_id() > 0 ) {
                current.setGenes_creature(genRepository.findGenC(creatureDTO.getGene_id()));
            }
            else{
                current.setGenes_creature(current.getGenes_creature());
            }

            if (creatureDTO.getRare_niveau() > 0) {
                current.setRare(rareRepository.findRareC(creatureDTO.getRare_niveau()));
            }
            else{
                current.setRare(current.getRare());
            }

            return creatureMapper.toDto(creatureRepository.save(current));
        }
        else {
            return null;
        }
    }

    public String deleteCreature(int id) {
        Creature current = creatureRepository.findById(id).orElse(null);
        if (current != null) {
            creatureRepository.deleteById(id);
            return "\"Creature Supprimée\"";
        }
        else{
            return "\"Creature non trouvée\"";
        }
    }
}
