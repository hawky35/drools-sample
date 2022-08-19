package org.sample.drools.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
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
