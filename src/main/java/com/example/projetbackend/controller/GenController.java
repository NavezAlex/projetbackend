package com.example.projetbackend.controller;

import com.example.projetbackend.model.dto.GenerationDTO;
import com.example.projetbackend.service.GenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/gen")
public class GenController {

    @Autowired
    private GenService genService;

    @GetMapping
    public Set<GenerationDTO> getGens() {
        return genService.getGens();
    }

    @GetMapping("/{id}")
    public GenerationDTO getGens(@PathVariable int id) {
        return genService.getGenById(id);
    }

}
