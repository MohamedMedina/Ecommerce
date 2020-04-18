package com.medina.bookstore.service.impl;

import org.springframework.stereotype.Service;

import com.medina.bookstore.domain.Payment;
import com.medina.bookstore.domain.UserPayment;
import com.medina.bookstore.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	public Payment setByUserPayment(UserPayment userPayment, Payment payment) {
		payment.setType(userPayment.getType());
		payment.setHolderName(userPayment.getHolderName());
		payment.setCardNumber(userPayment.getCardNumber());
		payment.setExpiryMonth(userPayment.getExpiryMonth());
		payment.setExpiryYear(userPayment.getExpiryYear());
		payment.setCvc(userPayment.getCvc());
		
		return payment;
	}

}
