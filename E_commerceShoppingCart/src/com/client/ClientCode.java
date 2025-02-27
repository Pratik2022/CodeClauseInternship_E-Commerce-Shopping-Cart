package com.client;

import com.services.shopServices;
import com.shopServicesImpl.ProductServiceImpl;
import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {
        shopServices service = new ProductServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== E-Commerce System =====");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. Remove from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.displayProducts();
                    break;
                case 2:
                    System.out.print("Enter Product ID to add: ");
                    service.addToCart(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Product ID to remove: ");
                    service.removeFromCart(sc.nextInt());
                    break;
                case 4:
                    service.viewCart();
                    break;
                case 5:
                    service.checkout();
                    break;
                case 6:
                    System.out.println("Thank you for using our system!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}