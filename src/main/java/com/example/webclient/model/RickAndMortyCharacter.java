package com.example.webclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RickAndMortyCharacter {

    String name;
    String species;
    String status;

    @Override
    public String toString() {
        return "Name: " + name +
                ", Species: " + species +
                ", Status: " + status;
    }
}
