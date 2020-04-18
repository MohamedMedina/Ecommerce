
package com.medina.bookstore.service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medina.bookstore.domain.BillingAddress;
import com.medina.bookstore.domain.Book;
import com.medina.bookstore.domain.CartItem;
import com.medina.bookstore.domain.Order;
import com.medina.bookstore.domain.Payment;
import com.medina.bookstore.domain.ShippingAddress;
import com.medina.bookstore.domain.ShoppingCart;
import com.medina.bookstore.domain.User;
import com.medina.bookstore.repository.OrderRepository;
import com.medina.bookstore.service.CartItemService;
import com.medina.bookstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CartItemService cartItemService;

	public synchronized Order createOrder(ShoppingCart shoppingCart, ShippingAddress shippingAddress,
			BillingAddress billingAddress, Payment payment, String shippingMethod, User user) {
		Order order = new Order();
		order.setBillingAddress(billingAddress);
		order.setOrderStatus("created");
		order.setPayment(payment);
		order.setShippingAddress(shippingAddress);
		order.setShippingMethod(shippingMethod);

		List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);

		for (CartItem cartItem : cartItemList) {
			Book book = cartItem.getBook();
			cartItem.setOrder(order);
			book.setInStockNumber(book.getInStockNumber() - cartItem.getQty());
		}

		order.setCartItemList(cartItemList);
		order.setOrderDate(Calendar.getInstance().getTime());
		order.setOrderTotal(shoppingCart.getGrandTotal());
		shippingAddress.setOrder(order);
		billingAddress.setOrder(order);
		payment.setOrder(order);
		order.setUser(user);
		order = orderRepository.save(order);

		return order;
	}

	public Order findOne(Long id) {
		return orderRepository.findOne(id);
	}

}
