package OnlineShoppingSystem.controller;

import model.Product;

public class Admin {
    public void addProduct(Product product) {
        System.out.println("Product added: " + product);
    }

    public void removeProduct(Product product) {
        System.out.println("Product removed: " + product);
    }

    public void updateProduct(Product product) {
        System.out.println("Product updated: " + product);
    }
}