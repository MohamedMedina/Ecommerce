package com.medina.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.medina.bookstore.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
