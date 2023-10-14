package com.example.sever_dd2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sever_dd2.Models.Product;
import com.example.sever_dd2.Services.Product.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired ProductService productService;
    @GetMapping("/xinchao")
    public String Hello() {
        return "Xin chao da toi voi spring boot dd2";
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/getProduct")
    public List<Product> getProduct(){
        return productService.getProducts();
    }
    
}
