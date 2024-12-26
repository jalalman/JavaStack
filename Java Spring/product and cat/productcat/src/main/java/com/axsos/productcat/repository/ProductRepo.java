package com.axsos.productcat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.productcat.model.Category;
import com.axsos.productcat.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findAll();
    List<Product> findByCategoriesNotContains(Category category);
    List<Product> findByCategoriesId(Long id);
}
