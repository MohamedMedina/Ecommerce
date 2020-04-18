package com.medina.bookstore.service;

import com.medina.bookstore.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
