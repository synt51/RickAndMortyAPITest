package com.example.webclient;


import com.example.webclient.service.RickAndMortyCharacterService;
import com.example.webclient.service.RickAndMortyLocationService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebclientApplication {

    public static void main(String[] args) {

//        SpringApplication.run(WebclientApplication.class, args);
//
//        JsonNode webClient = WebClient.create("https://rickandmortyapi.com")
//                .get().uri("/api/character/2")
//                .retrieve()
//                .bodyToMono(JsonNode.class)
//                .block();
//
//        System.out.println(webClient);

        RickAndMortyCharacterService.getCharacterById(3);
        RickAndMortyLocationService.getLocationById(1);
    }

}
