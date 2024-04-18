package com.category.productmanagement.service;



import com.category.productmanagement.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product addProduct(Product product);
    Product getProductById(Long id);
    Product updateProduct(Product product,Long id);
    String deleteProductById(Long id);
}

