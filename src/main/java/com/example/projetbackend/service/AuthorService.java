package com.example.projetbackend.service;

import com.example.projetbackend.mapper.AuthorMapper;
import com.example.projetbackend.model.dto.AuthorDTO;
import com.example.projetbackend.model.entity.Author;
import com.example.projetbackend.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    public AuthorDTO save(AuthorDTO authorDTO) {
        return authorMapper.toDto(
                authorRepository.save(authorMapper.toEntity(authorDTO))
        );
    }

    public Set<AuthorDTO> getAuthors() {
        return authorRepository.findAll()
                .stream()
                .map(authorMapper::toDto)
                .collect(Collectors.toSet());
    }

    public AuthorDTO getAuthorById(int id) {
        return authorMapper.toDto(
                authorRepository.findById(id).orElse(null)
        );
    }

    public String deleteAuthor(int id) {
        authorRepository.deleteById(id);
        return "Author deleted";
    }

    public AuthorDTO updateAuthor(AuthorDTO authorDTO) {
        if (authorDTO.getId() > 0) {
            Author current = authorRepository.findById(authorDTO.getId()).orElse(null);
            if (authorDTO.getFirstName() != null) {
                current.setFirstName(authorDTO.getFirstName());
            }

            if (authorDTO.getLastName() != null) {
                current.setLastName(authorDTO.getLastName());
            }
            return authorMapper.toDto(authorRepository.save(current));
        }
        else {
            return null;
        }

    }

}
