package org.sample.drools.model;

import java.io.Serializable;

public class Product implements Serializable {
    @org.kie.api.definition.type.Label("name")
    private String name;
    @org.kie.api.definition.type.Label("price")
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
