package org.sample.drools.model;

import java.io.Serializable;

public class Purchase implements Serializable {
    @org.kie.api.definition.type.Label("customer")
    private Customer customer;
    @org.kie.api.definition.type.Label("product")
    private Product  product;
    public Purchase(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Product getProduct() {
        return product;
    }
}
