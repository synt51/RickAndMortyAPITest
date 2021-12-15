package com.example.webclient.model;


import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@NoArgsConstructor
public class RickAndMortyResult {

    int characterId;
    int episodeId;
    int locationId;


}
