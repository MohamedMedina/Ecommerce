package com.medina.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.medina.bookstore.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
