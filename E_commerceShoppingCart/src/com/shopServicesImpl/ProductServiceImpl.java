package com.shopServicesImpl;

import com.bean.Product;
import com.services.shopServices;
import java.util.*;

public class ProductServiceImpl implements shopServices {
    private List<Product> productList;
    private List<Product> cart;
    private Scanner sc = new Scanner(System.in);

    public ProductServiceImpl() {
        productList = Arrays.asList(
                new Product(1, "Laptop", 80000),
                new Product(2, "Smartphone", 50000),
                new Product(3, "Headphones", 2000),
                new Product(4, "Tablet", 30000)
        );
        cart = new ArrayList<>();
    }

    @Override
    public void displayProducts() {
        System.out.println("\nAvailable Products:");
        for (Product p : productList) {
            System.out.println(p);
            System.out.println();
            }
    }

    @Override
    public void addToCart(int productId) {
        for (Product p : productList) {
            if (p.getId() == productId) {
                cart.add(p);
                System.out.println(p.getName() + " added to cart.");
                System.out.println();
                return;
            }
        }
        System.out.println("Product not found.");
        System.out.println();
    }

    @Override
    public void removeFromCart(int productId) {
        for (Product p : cart) {
            if (p.getId() == productId) {
                cart.remove(p);
                System.out.println(p.getName() + " removed from cart.");
                System.out.println();
                return;
            }
        }
        System.out.println("Product not found in cart.");
        System.out.println();

    }

    @Override
    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            System.out.println();
            return;
        }
        System.out.println("\nYour Shopping Cart:");
        for (Product p : cart) {
            System.out.println(p);
            System.out.println();
        }
    }

    @Override
    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Add products before checkout.");
            System.out.println();
            return;
        }
        double total = cart.stream().mapToDouble(Product::getPrice).sum();
        System.out.println("Total Bill: Rs. " + total);
        System.out.println("Checkout successful. Thank you for shopping!");
        System.out.println();
        cart.clear();
    }
}