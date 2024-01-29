package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class City {

    private static final List<String> cities = List.of(
            "Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
            "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York",
            "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"
    );

    public List<String> searchCities(String text) throws NotFoundException {
        if (text.length() < 2) {
            throw new NotFoundException("Le texte de recherche doit contenir au moins 2 caractères");
        }

        List<String> matchingCities = new ArrayList<>();
        for (String city : cities) {
            if (city.toLowerCase().startsWith(text.toLowerCase())) {
                matchingCities.add(city);
            }
        }
        return matchingCities;
    }

}
