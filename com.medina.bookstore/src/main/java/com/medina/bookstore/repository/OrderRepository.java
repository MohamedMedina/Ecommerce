package com.medina.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.medina.bookstore.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
