package com.example.sever_dd2.Services.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sever_dd2.Models.Product;
import com.example.sever_dd2.Repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired ProductRepository productRepository;

    public Product addProduct(Product product){
        if(product != null){
            return productRepository.save(product);
        }
        return null;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }
}
