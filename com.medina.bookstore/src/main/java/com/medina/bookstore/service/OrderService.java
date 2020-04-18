package com.medina.bookstore.service;

import com.medina.bookstore.domain.BillingAddress;
import com.medina.bookstore.domain.Order;
import com.medina.bookstore.domain.Payment;
import com.medina.bookstore.domain.ShippingAddress;
import com.medina.bookstore.domain.ShoppingCart;
import com.medina.bookstore.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
