package com.example.correction_boutique_bonbons.repository;


import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;




@RepositoryRestResource(path = "candies", collectionResourceRel = "candies")
public interface CandyRepository extends CrudRepository<Candy, Long> {

    @RestResource(path = "searchname")
    List<Candy> findAllByNameContaining(@Param("name") String name);
    List<Candy> findAllByMagicEffect(String magicEffect);
    List<Candy> findAllByPriceBetween(double minPrice, double maxPrice);

    @RestResource(exported = false)
    void deleteById(long id);

}
