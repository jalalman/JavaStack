package com.axsos.productcat.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.axsos.productcat.model.Product;
import com.axsos.productcat.model.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
    List<Category> findAll();
    List<Category> findByProductsNotContains(Product product);

}