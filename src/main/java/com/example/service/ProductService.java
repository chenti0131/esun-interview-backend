package com.example.service;

import com.example.model.ProductModel;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void addProduct(ProductModel productModel) {
        productRepository.addProduct(productModel);
    }
}
