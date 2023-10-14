package com.example.sever_dd2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(name = "productName", nullable = false)
    private String productName;

    private String quanlity;

    private String productType;

    public Long getIdProduct() {
        return idProduct;
    }
    public String getProductName() {
        return productName;
    }
    public String getQuanlity() {
        return quanlity;
    }
    public String getProductType() {
        return productType;
    }
    
    public void setProductName(String nameProduct) {
        this.productName = nameProduct;
    }
    public void setQuanlity(String quanlityProduct) {
        this.quanlity = quanlityProduct;
    }
    public void setProductType(String typeProduct) {
        this.productType = typeProduct;
    }
}
