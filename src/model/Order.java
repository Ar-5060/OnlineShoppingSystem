package model;

import java.util.Date;

public class Order {
    private static int orderCounter = 0;
    private int orderId;
    private User customer;
    private ShoppingCart shoppingCart;
    private Date orderDate;

    public Order(User customer, ShoppingCart shoppingCart) {
        this.orderId = ++orderCounter;
        this.customer = customer;
        this.shoppingCart = shoppingCart;
        this.orderDate = new Date();
    }

    public int getOrderId() {
        return orderId;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + " | Date: " + orderDate + "\n" + shoppingCart;
    }
}