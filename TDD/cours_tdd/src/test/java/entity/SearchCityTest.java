package entity;

import org.example.entity.City;
import org.example.entity.NotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SearchCityTest {
    private City city;

    @Test
    void searchCityContainAtLess2Characters() {
        city = new City();
        Assertions.assertThrows(RuntimeException.class, () -> city.searchCities("V"));
    }

    @Test
    void searchCityContainAtLeast2Characters() throws NotFoundException {
        city = new City();
        List<String> result = city.searchCities("Va");
        Assertions.assertEquals(List.of( "Valence","Vancouver"), result);
    }

    @Test
    void searchCityContainAtLeast2CharactersIgnoreCase() throws NotFoundException {
        city = new City();
        Assertions.assertEquals(List.of("Budapest"), city.searchCities("Bu"));
        Assertions.assertEquals(List.of("Budapest"), city.searchCities("bu"));
    }
    @Test
    void searchCityPartialName() throws NotFoundException {
        city = new City();
        Assertions.assertEquals(List.of("Budapest"), city.searchCities("ape"));
    }

    @Test
    void searchCityWithAsterisk() throws NotFoundException {
        city = new City();
        Assertions.assertEquals(List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"), city.searchCities("*"));
    }

}
