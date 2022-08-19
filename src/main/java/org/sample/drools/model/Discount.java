package org.sample.drools.model;

import java.io.Serializable;

public class Discount implements Serializable{
    @org.kie.api.definition.type.Label("customer")
    private Customer customer;
    @org.kie.api.definition.type.Label("amount")
    private int      amount;
    public Discount(Customer customer,
                    int amount) {
        this.customer = customer;
        this.amount = amount;
    }
    public Customer getCustomer() {
        return customer;
    }
    public int getAmount() {
        return amount;
    }
}
