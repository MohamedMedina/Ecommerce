package com.medina.bookstore.service;

import com.medina.bookstore.domain.BillingAddress;
import com.medina.bookstore.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
