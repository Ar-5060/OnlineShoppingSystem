package controllers;

import services.ProductService;
import services.UserService;
import models.*;
import java.util.Scanner;

public class TerminalMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();
    private static UserService userService = new UserService();  // This is now being used
    private static MainController mainController = new MainController();

    public static void main(String[] args) {
        showHomePage();
    }

    public static void showHomePage() {
        System.out.println("Welcome to the Online Shopping System");
        System.out.println("1. Login");
        System.out.println("2. View Products");
        System.out.println("3. View Cart");
        System.out.println("4. Exit");
        System.out.print("Please select an option (1-4): ");
        
        int option = scanner.nextInt();
        
        switch (option) {
            case 1:
                login();
                break;
            case 2:
                viewProducts();
                break;
            case 3:
                viewCart();
                break;
            case 4:
                System.out.println("Exiting system...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                showHomePage();
                break;
        }
    }

    public static void login() {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        
        // Authenticate user using the userService
        if (userService.authenticateUser(username, password)) {
            System.out.println("Login successful!");
            mainController.userLogin(username, password);  // Proceed with login in MainController
        } else {
            System.out.println("Invalid login credentials.");
        }
        showHomePage();
    }

    public static void viewProducts() {
        System.out.println("List of Products:");
        productService.getAllProducts().forEach(product -> 
            System.out.println(product.getId() + ". " + product.getName() + " - " + product.getPrice())
        );
        System.out.print("Press any key to return to the Home Page: ");
        scanner.nextLine();  // Consume newline
        scanner.nextLine();  // Wait for user input
        showHomePage();
    }

    public static void viewCart() {
        System.out.println("Your Shopping Cart:");
        // You can extend this with actual cart functionality.
        System.out.println("No products in cart yet.");
        System.out.print("Press any key to return to the Home Page: ");
        scanner.nextLine();  // Consume newline
        scanner.nextLine();  // Wait for user input
        showHomePage();
    }
}