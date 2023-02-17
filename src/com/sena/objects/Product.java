package com.sena.objects;

import java.util.ArrayList;

public class Product {

    private String name, description, code;
    private float price;
    private int quantity;
    public static int quantityOfProductsCreated = 0;
    public static ArrayList<Product> productsCreated = new ArrayList<>();

    public Product (String name, float price, String code) {
        this.name = name;
        this.price = price;
        this.code = code;
        Product.quantityOfProductsCreated++;
        Product.productsCreated.add(this);
    }

    public Product () { }
    public Product (String name, float price, int quantity, String description, String code) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.code = code;
        this.quantity = quantity;
        Product.quantityOfProductsCreated++;
        Product.productsCreated.add(this);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
