package com.example.webclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RickAndMortyEpisode {

    String name;
    String air_date;
    String episode;

    @Override
    public String toString() {
        return "Name: " + name +
                ", First Time on air: " + air_date +
                ", Episode: " + episode;
    }
}
