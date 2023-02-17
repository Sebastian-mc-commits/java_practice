package com.sena.objects;

import java.util.ArrayList;

public class User {

    private String name, email, password, direction, telPhone;
    private Product product = new Product();
    private ArrayList<String> cart = new ArrayList<>();

    public User (String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User (String name, String email, String password, String telPhone, String direction) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.telPhone = telPhone;
        this.direction = direction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getTelPhone(){
        return this.telPhone;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection(){
        return this.direction;
    }

    public String getEmail() {
        return email;
    }

    public String setProductToCart (Product product) {
        this.cart.add(product.getCode());
        return "Product set " + product.getName() + " succsessfully";
    }

    public ArrayList<String> getProductsOfCart() {
        return this.cart;
    }
}
