package com.example.projetbackend.controller;

import com.example.projetbackend.model.dto.FamilleDTO;
import com.example.projetbackend.model.dto.ZoneDTO;
import com.example.projetbackend.service.FamilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/famille")
public class FamilleController {

    @Autowired
    private FamilleService familleService;

//    @GetMapping
//    public Set<FamilleDTO> getFamilles() {
//        return familleService.getFamilles();
//    }
//
    @GetMapping("/gen/{gen}")
//    @GetMapping
//    public List<FamilleDTO> getFamillesByGen(@RequestBody FamilleDTO dto){
    public List<FamilleDTO> getFamillesByGen(@PathVariable int gen){
        return familleService.getFamillesByGen(gen);
    }

    @GetMapping("/type/{type}/gen/{gen}")
    public List<FamilleDTO> getFamillesByType(@PathVariable String type, @PathVariable int gen){
        return familleService.getFamillesByType(type, gen);
    }

    @GetMapping("/type/{type}/gen/{gen}/exotic")
    public List<FamilleDTO> findFamilyExoticByType(@PathVariable String type, @PathVariable int gen){
        return familleService.getFamilyExoticByType(type, gen);
    }

    @GetMapping("/zone/{zone}")
    public List<String> getFamillesByZone(@PathVariable String zone){
        return familleService.getFamillesByZone(zone);
    }

    @GetMapping("/{name}")
    public List<FamilleDTO> getFamillesByName(@PathVariable String name){
        return familleService.getFamilleByName(name);
    }

    @GetMapping("gen/{gen}/exotic")
    public List<FamilleDTO> getFamillesExotic(@PathVariable int gen){
        return familleService.getFamillesExotic(gen);
    }

}
