package com.vrup.jlab.demo.controller;

import com.vrup.jlab.demo.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products") // Sets the base URL path for this controller
public class ProductController {

    private final List<Product> products = new ArrayList<>();

    public ProductController() {
        // Adding dummy data for demonstration
        products.add(new Product(1L, "Laptop", 999.99));
        products.add(new Product(2L, "Smartphone", 499.99));
    }

    // GET Method: Fetch all products
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    // GET Method: Fetch a specific product by its ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // POST Method: Create a new product
    @PostMapping
    public Product createProduct(@RequestBody Product newProduct) {
        products.add(newProduct);
        return newProduct;
    }
}
