package services;

import models.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
        // Prepopulate with demo products
        products.add(new Product(1, "Laptop", 50000.00, "High-performance laptop with 16GB RAM and 512GB SSD."));
        products.add(new Product(2, "Smartphone", 20000.00, "Latest model smartphone with 6GB RAM and 128GB storage."));
        products.add(new Product(3, "Smartwatch", 5000.00, "Fitness smartwatch with heart rate monitoring and 7-day battery life."));
        products.add(new Product(4, "Bluetooth Headphones", 2500.00, "Wireless over-ear headphones with noise cancellation and 30-hour battery life."));
        products.add(new Product(5, "Tablet", 15000.00, "10-inch tablet with stylus support and 4GB RAM."));
        products.add(new Product(6, "Wireless Keyboard", 1500.00, "Compact wireless keyboard with long battery life and Bluetooth compatibility."));
        products.add(new Product(7, "Gaming Mouse", 2000.00, "Ergonomic gaming mouse with customizable RGB lighting and DPI adjustments."));
        products.add(new Product(8, "External Hard Drive", 4000.00, "1TB external hard drive for data backup and storage expansion."));
        products.add(new Product(9, "Laptop Bag", 800.00, "Durable laptop bag with multiple compartments and padded interior."));
        products.add(new Product(10, "Portable Charger", 1000.00, "10,000mAh portable power bank with fast charging support."));
    }

    // Fetch all products
    public List<Product> getAllProducts() {
        return products;
    }
}