package com.axsos.productcat.service;

import java.util.List;
import com.axsos.productcat.model.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.productcat.model.Product;
import com.axsos.productcat.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;



    public List<Product> allProducts() {
        return productRepo.findAll();
    }
    public Product createProduct(Product p) {
        return productRepo.save(p);
    }
    public Product findProduct(Long id) {
        return productRepo.findById(id).orElse(null);
    }
    public List<Product> findProductsByCategory(Long id) {
        return productRepo.findByCategoriesId(id);
    }
    public List<Product> findsByCategoriesNotContains(Category category) {
        return productRepo.findByCategoriesNotContains(category);
    }

}
