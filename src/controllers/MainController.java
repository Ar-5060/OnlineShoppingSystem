package controllers;

import services.ProductService;
import services.UserService;
import models.*;

public class MainController {
    private ProductService productService;
    private UserService userService;
    private ShoppingCart shoppingCart;

    public MainController() {
        productService = new ProductService();
        userService = new UserService();
    }

    // Login logic
    public void userLogin(String username, String password) {
        if (userService.authenticateUser(username, password)) {
            System.out.println("Login successful!");
            shoppingCart = new ShoppingCart(new User(username, password, ""));
        } else {
            System.out.println("Invalid login credentials.");
        }
    }

    // View all products
    public void displayProducts() {
        productService.getAllProducts().forEach(product -> 
            System.out.println(product.getName() + " - " + product.getPrice())
        );
    }

    // Get shopping cart
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}