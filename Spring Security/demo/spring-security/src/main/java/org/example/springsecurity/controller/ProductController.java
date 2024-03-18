package org.example.springsecurity.controller;

import org.example.springsecurity.model.Product;
import org.example.springsecurity.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {

    ProductRepository productRepository;
    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }




    @GetMapping("/products")
    public List<Product> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return  products;
    }

    @GetMapping("/product/{id}")
    public List<Product> getProductById(@PathVariable("id") Long id){
        return productRepository.getProductById(id);
    }
    @PostMapping("/add")
    public  Product addProduct(Product p){
        return productRepository.save(p);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable("id")Long id, Product product){
        productRepository.delete(product);
        System.out.println("product deleted");
    }

    @PutMapping("/update/{id}")
    public void updateProduct (@PathVariable("id")Long id, Product product){
        productRepository.save(product);
        System.out.println("product update");
    }

}
