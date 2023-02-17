package com.sena.objects;

public class Order {

    private User user;
    private Product[] products;
    public Order (User user, Product[] products) {
        this.user = user;
        this.products = products;
    }

    public float total () {

        if (this.products.length <= 0) return 0.0F;

        float total = 0;
        for (Product value : this.products) {
            total += value.getPrice();
        }
        return total;
    }
}
