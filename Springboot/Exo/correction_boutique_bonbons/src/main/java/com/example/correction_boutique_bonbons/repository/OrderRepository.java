package com.example.correction_boutique_bonbons.repository;

import com.example.correction_boutique_bonbons.entity.CandyOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;
@RepositoryRestResource(path = "order", collectionResourceRel = "ordersOfCandy")
public interface OrderRepository  extends CrudRepository<CandyOrder, Long> {
    List<CandyOrder> findAllById(Long id);
    List<CandyOrder> findAllByDate(Date date);
    List<CandyOrder> findAllByStatus(String status);


    void deleteById(Long id);
}
