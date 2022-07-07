package com.example.projetbackend.mapper;

import com.example.projetbackend.model.dto.TypeDTO;
import com.example.projetbackend.model.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class TypeMapper {

//    @Autowired
//    private FamilleMapper familleMapper;

    public TypeDTO toDto(Type type) {
        if (type == null) {
            return null;
        }

        TypeDTO dto = new TypeDTO();
        dto.setId(type.getId());
        dto.setName(type.getName());
//        dto.setFamilles(type.getFamilles()
//                .stream()
//                .map(familleMapper::toDto)
//                .collect(Collectors.toList())
//        );

        return dto;
    }

    public Type toEntity(TypeDTO typeDTO) {
        if (typeDTO == null) {
            return null;
        }

        Type entity = new Type();
        entity.setId(typeDTO.getId());
        entity.setName(typeDTO.getName());
//        entity.setFamilles(typeDTO.getFamilles()
//                .stream()
//                .map(familleMapper::toEntity)
//                .collect(Collectors.toList())
//        );

        return entity;
    }

}
