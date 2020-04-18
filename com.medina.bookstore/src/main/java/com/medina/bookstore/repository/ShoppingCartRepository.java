package com.medina.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.medina.bookstore.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
