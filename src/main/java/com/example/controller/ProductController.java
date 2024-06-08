package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.service.ProductService;
import com.example.model.ProductModel;
import java.util.LinkedHashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(produces = "application/json")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("addProduct")
    public Map<String, Object> addProduct(@RequestBody ProductModel productModel) {

        Map<String, Object> response = new LinkedHashMap<>();
        String msg = "succeess";

        try{
            productService.addProduct(productModel);
        } catch(Exception e){
            msg = e.getMessage();
        }

        response.put("msg", msg);

        return response;
    }
}
