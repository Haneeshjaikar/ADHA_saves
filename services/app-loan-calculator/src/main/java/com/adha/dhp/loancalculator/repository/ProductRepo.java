package com.adha.dhp.loancalculator.repository;

import com.adha.dhp.loancalculator.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products, Long> {

}