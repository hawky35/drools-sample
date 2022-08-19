package org.sample.drools.model;

import java.io.Serializable;

public class Customer implements Serializable {
    @org.kie.api.definition.type.Label("name")
    private String name;
    @org.kie.api.definition.type.Label("discount")
    private int    discount;
    public Customer(String name,
                    int discount) {
        this.name = name;
        this.discount = discount;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
