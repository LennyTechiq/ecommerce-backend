package com.techiq.ecommercebackend.ecommercebackend.modal.dao;

import com.techiq.ecommercebackend.ecommercebackend.modal.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
