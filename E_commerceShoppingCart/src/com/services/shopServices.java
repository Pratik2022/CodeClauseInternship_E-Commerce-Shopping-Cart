package com.services;

import com.bean.Product;
import java.util.List;

public interface shopServices {
    void displayProducts();
    void addToCart(int productId);
    void removeFromCart(int productId);
    void viewCart();
    void checkout();
}