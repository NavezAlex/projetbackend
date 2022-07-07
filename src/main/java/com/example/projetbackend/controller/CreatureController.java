package com.example.projetbackend.controller;

import com.example.projetbackend.model.dto.CreatureDTO;
import com.example.projetbackend.service.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/creature")
public class CreatureController {

    @Autowired
    private CreatureService creatureService;

//    @GetMapping
//    public Set<CreatureDTO> getCreatures() {
//        return creatureService.getCreatures();
//    }
//
    @GetMapping("/gen/{gen}")
//    @GetMapping
//    public List<CreatureDTO> getCreaturesByGen(@RequestBody CreatureDTO dto) {
    public List<CreatureDTO> getCreaturesByGen(@PathVariable int gen) {
        return creatureService.getCreaturesByGen(gen);
    }

    @GetMapping("/gen/{gen}/famille/{famille}")
//    @GetMapping("/famille")
    public List<CreatureDTO> getCreaturesByFamilly(@PathVariable int gen, @PathVariable String famille) {
//    public List<CreatureDTO> getCreaturesByFamilly(@RequestBody CreatureDTO dto) {
        return creatureService.getCreaturesByFamilly(famille, gen);
    }

    @GetMapping("/famille/rarity")
//    public List<CreatureDTO> getCreaturesByFamilly(@PathVariable int gen, @PathVariable String famille) {
    public List<CreatureDTO> findCreatureByFamilleRare(@RequestBody CreatureDTO dto) {
        return creatureService.findCreatureByFamilleRare(dto.getNom_Famille(), dto.getRare_niveau(), dto.getGene_id());
    }

//    @GetMapping("/rarity/{rare}")
    @GetMapping("/rarity")
//    public List<CreatureDTO> getCreaturesByRarity(@PathVariable int rare) {
    public List<CreatureDTO> getCreaturesByRarity(@RequestBody CreatureDTO dto) {
        return creatureService.getCreaturesByRarity(dto.getRare_niveau(), dto.getGene_id());
    }

    @GetMapping("/id/{id}")
    public CreatureDTO getCreaturesById(@PathVariable int id) {
        return creatureService.getCreatureById(id);
    }

    @GetMapping("/{name}")
    public List<CreatureDTO> getCreaturesByName(@PathVariable String name) {
        return creatureService.getCreaturesByName(name);
    }


    @PostMapping
    public CreatureDTO addCreature(@RequestBody CreatureDTO creatureDTO) {
    //public CreatureDTO addCreature(@RequestBody Map<String, String> creatureDTO) {
        return creatureService.save(creatureDTO);
        //System.out.println(creatureDTO);
        //return null ;
    }

    @CrossOrigin("*")
    @DeleteMapping("/delete/{id}")
    public String deleteCreature(@PathVariable int id) {
        return creatureService.deleteCreature(id);
    }

    @CrossOrigin("*")
    @PutMapping("/update/{id}")
    public CreatureDTO updateCreature(@PathVariable int id, @RequestBody CreatureDTO creatureDTO) {
        return creatureService.updateCreature(id, creatureDTO);
    }
}