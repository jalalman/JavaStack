package com.axsos.productcat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.productcat.model.Category;
import com.axsos.productcat.model.Product;
import com.axsos.productcat.repository.CategoryRepo;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;
    public List<Category> allCategories() {
        return categoryRepo.findAll();
    }
    public Category createCategory(Category c) {
        return categoryRepo.save(c);
    }
    public Category findCategory(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }
    public List<Category> findsCategoriesNotInProduct(Product product) {
        return categoryRepo.findByProductsNotContains(product);
    }

}
