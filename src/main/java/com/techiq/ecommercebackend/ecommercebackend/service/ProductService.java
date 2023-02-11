package com.techiq.ecommercebackend.ecommercebackend.service;

import com.techiq.ecommercebackend.ecommercebackend.modal.Product;
import com.techiq.ecommercebackend.ecommercebackend.modal.dao.ProductDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> getProducts() {
        return productDAO.findAll();
    }
}
