package com.example.sever_dd2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sever_dd2.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
