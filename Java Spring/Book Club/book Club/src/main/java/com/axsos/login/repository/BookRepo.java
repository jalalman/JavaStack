package com.axsos.login.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.login.model.Book;
@Repository
public interface BookRepo extends CrudRepository<Book,Long>{
    List<Book> findAll();
    
}
