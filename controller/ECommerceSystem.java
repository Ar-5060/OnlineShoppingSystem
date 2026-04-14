package OnlineShoppingSystem.controller;

import model.Product;
import model.ShoppingCart;
import model.User;
import model.Order;

import java.util.Scanner;

public class ECommerceSystem {

    private static Scanner scanner = new Scanner(System.in);
    private ShoppingCart currentCart = new ShoppingCart();


    public ECommerceSystem() {
        
    }

    public void mainMenu() {
        System.out.println("Welcome to the Online Shopping System!");
        boolean running = true;

        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Browse Products");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    browseProducts();
                    break;
                case 2:
                    viewCart();
                    break;
                case 3:
                    checkout();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using the Online Shopping System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void browseProducts() {
        System.out.println("\nAvailable Products:");
        Product product1 = new Product("P001", "Laptop", "A high-end laptop", 800.0, 10);
        Product product2 = new Product("P002", "Smartphone", "A latest model smartphone", 500.0, 5);
        
        System.out.println("1. " + product1);
        System.out.println("2. " + product2);

        System.out.print("Enter the number of the product you want to add to the cart: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  
        
        switch (choice) {
            case 1:
                addToCart(product1);
                break;
            case 2:
                addToCart(product2);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private void addToCart(Product product) {
        System.out.print("Enter the quantity to add to the cart: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        
        currentCart.addItem(product, quantity);
        System.out.println(quantity + " " + product.getName() + "(s) added to your cart.");
    }

    private void viewCart() {
        System.out.println("\nYour Shopping Cart:");
        currentCart.viewCart();
    }

    private void checkout() {
        if (currentCart.getTotalPrice() == 0) {
            System.out.println("Your cart is empty. Please add products to your cart.");
        } else {
            System.out.println("\nChecking out...");
            double total = currentCart.getTotalPrice();
            System.out.println("Total amount: $" + total);
            System.out.print("Do you want to proceed with the purchase? (yes/no): ");
            String response = scanner.nextLine();
            
            if (response.equalsIgnoreCase("yes")) {
                Order order = new Order(new User("U001", "John Doe", "john.doe@example.com", "password123"), currentCart);
                System.out.println("Order placed successfully!");
                System.out.println("Order details: " + order);
                currentCart = new ShoppingCart(); // Clear the cart after checkout
            } else {
                System.out.println("Checkout canceled.");
            }
        }
    }

}