package com.example.controller;

import com.example.entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/products")
public class ProductController {

    final List<Product>  productList= new ArrayList<>(
            List.of(
                    new Product(11L,"product1","500"),
                    new Product(12L,"product2","500"))
                    );

    @GetMapping(value = "/get/all")
    public ResponseEntity<List<Product>> getProductList(){

        return ResponseEntity.ok(productList);
    }

        @PostMapping(value = "/add")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productList.add(product);
        return ResponseEntity.ok("Product added successfully");
    }
}
