package model;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getProductId().equals(product.getProductId())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        cartItems.add(new CartItem(product, quantity));
    }

    public void removeItem(String productId) {
        cartItems.removeIf(item -> item.getProduct().getProductId().equals(productId));
    }

    public double getTotalPrice() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (CartItem item : cartItems) {
                System.out.println(item);
            }
            System.out.println("Total Price: " + getTotalPrice());
        }
    }

    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }
}