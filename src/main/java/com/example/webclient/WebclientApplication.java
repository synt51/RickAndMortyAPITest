package com.example.webclient;


import com.example.webclient.service.RickAndMortyCharacterService;
import com.example.webclient.service.RickAndMortyEpisodeService;
import com.example.webclient.service.RickAndMortyLocationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebclientApplication {

    public static void main(String[] args) {

       // SpringApplication.run(WebclientApplication.class, args);

        RickAndMortyCharacterService characterService = new RickAndMortyCharacterService();
        RickAndMortyLocationService locationService = new RickAndMortyLocationService();
        RickAndMortyEpisodeService episodeService = new RickAndMortyEpisodeService();

        characterService.getCharacterById(3);
        locationService.getLocationById(1);
        episodeService.getEpisodeById(1);
    }

}
