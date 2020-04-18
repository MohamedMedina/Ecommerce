package com.medina.bookstore.service;

import com.medina.bookstore.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void removeById(Long id);
}
