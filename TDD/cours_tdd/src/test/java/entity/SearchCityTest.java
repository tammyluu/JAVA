package entity;

import org.example.entity.City;
import org.example.entity.NotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SearchCityTest {
    private City city;
    // repeat all mothods => refactor by setup()
    @BeforeEach
    void setUp(){
        city = new City();
        city.setCities(Arrays.asList("Valence","Vancouver", "Paris","Budapest" ));
    }

    @Test
    void searchCityContainAtLess2Characters() {
        //city = new City();
        Assertions.assertThrows(RuntimeException.class, () -> city.searchCities("V"));
    }

    @Test
    void searchCityContainAtLeast2CharactersWithWordGiven() throws NotFoundException {
        /*city = new City();
        city.setCities(Arrays.asList("Valence","Vancouver", "Paris","Budapest" ));*/
        List<String> result = city.searchCities("Va");
        Assertions.assertEquals(List.of( "Valence","Vancouver"), result);
}

    @Test
    void searchCityContainAtLeast2CharactersIgnoreCase() throws NotFoundException {
        //city = new City();

        Assertions.assertEquals(List.of("Budapest"), city.searchCities("Bu"));
        Assertions.assertEquals(List.of("Budapest"), city.searchCities("bu"));
    }
    @Test
    void searchCityPartialName() {
        ///city = new City();
        List<String> result = city.searchCitiespartialName("ape");
        Assertions.assertEquals(List.of("Budapest"), result);
    }

    @Test
    void searchCityWithAsterisk() throws NotFoundException {
        //city = new City();
        Assertions.assertEquals(List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"), city.searchCities("*"));
    }

}
