package com.example.webclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RickAndMortyLocation {

    String name;
    String type;
    String dimension;

    @Override
    public String toString() {
        return "Name: " + name +
                ", Type: " + type +
                ", Dimension: " + dimension;
    }
}
