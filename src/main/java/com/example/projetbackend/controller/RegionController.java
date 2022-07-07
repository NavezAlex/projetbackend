package com.example.projetbackend.controller;

import com.example.projetbackend.model.dto.RegionDTO;
import com.example.projetbackend.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/region")
public class RegionController {

    @Autowired
    private RegionService regionService;

//    @GetMapping
//    public Set<RegionDTO> getRegions() {
//        return regionService.getRegions();
//    }
//
    @GetMapping("/gen/{gen}")
//    @GetMapping
    public List<RegionDTO> getRegionsByGen(@PathVariable int gen) {
        return regionService.getRegionsByGen(gen);
    }

}
