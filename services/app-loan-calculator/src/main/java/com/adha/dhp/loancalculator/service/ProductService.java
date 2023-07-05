package com.adha.dhp.loancalculator.service;

import com.adha.dhp.loancalculator.entity.Products;
import com.adha.dhp.loancalculator.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Products add(Products products) {
        return productRepo.save(products);
    }
}
