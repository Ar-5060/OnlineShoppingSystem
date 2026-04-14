package models;

import java.util.List;

public class Order {
    private int orderId;
    private User user;
    private List<Product> products;
    private double totalAmount;

    public Order(int orderId, User user, List<Product> products, double totalAmount) {
        this.orderId = orderId;
        this.user = user;
        this.products = products;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}