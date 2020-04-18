package com.medina.bookstore.service;

import com.medina.bookstore.domain.Payment;
import com.medina.bookstore.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
