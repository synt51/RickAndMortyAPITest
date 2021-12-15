package com.example.webclient.controller;

import com.example.webclient.model.RickAndMortyCharacter;
import com.example.webclient.service.RickAndMortyCharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RickAndMortyCharacterController {

    private final RickAndMortyCharacterService characterService;

    public RickAndMortyCharacterController(RickAndMortyCharacterService characterService){
        this.characterService = characterService;
    }

    @GetMapping(path = "/character/{id}")
    public RickAndMortyCharacter getCharacterById(@PathVariable int characterId){
        return characterService.getCharacterById(characterId);
    }

}
