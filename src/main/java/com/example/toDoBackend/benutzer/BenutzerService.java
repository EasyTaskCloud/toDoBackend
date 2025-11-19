package com.example.toDoBackend.benutzer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenutzerService {
    public final BenutzerRepository benutzerRepo;
    private final BenutzerMapper mapper;
    public BenutzerService(BenutzerRepository benutzerRepo, BenutzerMapper mapper) {
        this.benutzerRepo = benutzerRepo;
        this.mapper = mapper;
    }


    public List<BenutzerDTO> getAllBenutzer() {
          return benutzerRepo.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }
}
