package com.example.projetbackend;

import com.example.projetbackend.controller.GenController;
import com.example.projetbackend.model.entity.Region;
import com.example.projetbackend.model.entity.Zone;
import com.example.projetbackend.repository.RegionRepository;
import com.example.projetbackend.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetbackendApp2 implements CommandLineRunner {

    @Autowired
    public RegionRepository regionRepository;
    @Autowired
    public ZoneRepository zoneRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetbackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        List<Region> regions = regionRepository.findRegionByGen(1);
//        for(Region region : regions){
//        	System.out.println(region.getName());
//        }
//
//        List<Zone> zonesR = zoneRepository.findZoneByRegion("Kalimdor");
//        List<Zone> zonesG = zoneRepository.findZoneByGen(1);
//
//        for (Zone zone : zonesR){
//            System.out.println(zone.getName());
//        }
//        for (Zone zone : zonesG){
//            System.out.println("Gen 1 : " + zone.getName());
//        }
    }

}
