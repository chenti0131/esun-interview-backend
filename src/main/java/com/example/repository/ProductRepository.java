package com.example.repository;

import com.example.DB.SQLs;
import com.example.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(ProductModel productModel) {
        jdbcTemplate.update(SQLs.ADD_PRODUCT, productModel.getProductID(), productModel.getProductName(), productModel.getPrice(), productModel.getQuantity());
    }
}
