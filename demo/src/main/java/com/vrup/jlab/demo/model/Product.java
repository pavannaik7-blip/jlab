package com.vrup.jlab.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private double price;

    // Constructors
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}