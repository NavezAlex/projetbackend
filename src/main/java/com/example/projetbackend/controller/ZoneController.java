package com.example.projetbackend.controller;

import com.example.projetbackend.model.dto.FamilleDTO;
import com.example.projetbackend.model.dto.ZoneDTO;
import com.example.projetbackend.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/zone")
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

//    @GetMapping
//    public Set<ZoneDTO> getZones() {
//        return zoneService.getZones();
//    }
//
    @GetMapping("/gen/{gen}")
//    @GetMapping
    public List<ZoneDTO> getZonesByGens(@PathVariable int gen) {
        return zoneService.getZonesByGen(gen);
    }

    @GetMapping("/{name}")
    public ZoneDTO getFamillesByName(@PathVariable String name){
        return zoneService.getZoneByName(name);
    }

    @GetMapping("/gen/{gen}/region/{region}")
    public List<ZoneDTO> getZonesByRegion(@PathVariable int gen, @PathVariable String region) {
        return zoneService.getZonesByRegion(region, gen);
    }

    @GetMapping("/famille")
    public List<String> getZonesByFamilly(@RequestBody FamilleDTO dto) {
        return zoneService.getZonesByFamily(dto.name_famille);
    }

}
