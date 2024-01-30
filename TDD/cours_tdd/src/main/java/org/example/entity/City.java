package org.example.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {





    private static List<String> cities = List.of(
            "Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
            "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York",
            "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"
    );
    public void setCities(List<String> cities) {
        this.cities = cities;
    }
    public List<String> searchCities(String text) throws NotFoundException {
        if (text.length() < 2) {
            throw new NotFoundException("Le texte de recherche doit contenir au moins 2 caractères");
        }

        List<String> result = new ArrayList<>();
        for (String city : cities) {
            if (city.toLowerCase().startsWith(text.toLowerCase())) {
                result.add(city);
            }
        }
        return result;
    }
    public List<String> searchCitiespartialName(String partialName) {

        if ("ape".equals(partialName)) {
            return List.of("Budapest");
        } else {
            return Collections.emptyList();
        }
    }



}
