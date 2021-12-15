package com.example.webclient.service;

import com.example.webclient.model.RickAndMortyCharacter;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class RickAndMortyCharacterService {


    static WebClient characters = WebClient.create("https://rickandmortyapi.com/api");

    public RickAndMortyCharacter getCharacterById(int characterId){

        RickAndMortyCharacter characterById = characters.get()
                .uri("/character/"+ characterId)
                .retrieve()
                .bodyToMono(RickAndMortyCharacter.class)
                .block();
        System.out.println("Character ID: " + characterId + ", " + characterById);
        return characterById;
    }

}
