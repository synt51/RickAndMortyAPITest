package com.example.webclient.service;


import com.example.webclient.model.RickAndMortyLocation;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RickAndMortyLocationService {

    static WebClient locations = WebClient.create("https://rickandmortyapi.com/api");

    public RickAndMortyLocation getLocationById(int locationId){

        RickAndMortyLocation locationById = locations.get()
                .uri("/location/"+ locationId)
                .retrieve()
                .bodyToMono(RickAndMortyLocation.class)
                .block();
        System.out.println("Location ID: " + locationId + ", " + locationById);
        return locationById;
    }
}
