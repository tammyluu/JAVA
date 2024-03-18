package org.example.springsecurity.repository;

import org.example.springsecurity.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
  List<Product> getProductById(Long id);

}
