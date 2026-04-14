package models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private User user;

    public ShoppingCart(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }

    // Add product to cart
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove product from cart
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Get total cost
    public double getTotalPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    // Getters and Setters
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}