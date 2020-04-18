package com.medina.bookstore.service;

import com.medina.bookstore.domain.ShippingAddress;
import com.medina.bookstore.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
