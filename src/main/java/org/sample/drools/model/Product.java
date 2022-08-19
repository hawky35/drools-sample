package org.sample.drools.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private float  price;
    public Product(String name,
                   float price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}
