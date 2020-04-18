package com.medina.bookstore.service;

import java.util.List;

import com.medina.bookstore.domain.Book;
import com.medina.bookstore.domain.CartItem;
import com.medina.bookstore.domain.Order;
import com.medina.bookstore.domain.ShoppingCart;
import com.medina.bookstore.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
