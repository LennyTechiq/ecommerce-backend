package com.techiq.ecommercebackend.ecommercebackend.api.controller.product;

import com.techiq.ecommercebackend.ecommercebackend.modal.Product;
import com.techiq.ecommercebackend.ecommercebackend.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}
