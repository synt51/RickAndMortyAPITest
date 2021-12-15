package com.example.webclient.service;

import com.example.webclient.model.RickAndMortyEpisode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RickAndMortyEpisodeService {

    static WebClient episodes = WebClient.create("https://rickandmortyapi.com/api");

    public static RickAndMortyEpisode getEpisodeById(int episodeId){

        RickAndMortyEpisode episodeById = episodes.get()
                .uri("/episode/" + episodeId)
                .retrieve()
                .bodyToMono(RickAndMortyEpisode.class)
                .block();
        System.out.println("Episode ID: " + episodeId + ", " + episodeById);
        return episodeById;
    }
}
