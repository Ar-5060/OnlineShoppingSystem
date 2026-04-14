package model;

public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;
    private int stock;

    public Product(String productId, String name, String description, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        this.stock -= quantity;
    }

    public boolean isInStock() {
        return stock > 0;
    }

    @Override
    public String toString() {
        return name + " - " + description + " | Price: " + price + " | Stock: " + stock;
    }
}