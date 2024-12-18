package com.example.demo.repository;

import com.example.demo.model.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long> {
   List<Burger> findAll();

}
