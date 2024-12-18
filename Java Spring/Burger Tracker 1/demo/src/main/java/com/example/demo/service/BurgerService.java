package com.example.demo.service;

import com.example.demo.model.Burger;
import com.example.demo.repository.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BurgerService {
    @Autowired
    BurgerRepository burgerRepository;
    public List<Burger> getAllBurgers() {
        return burgerRepository.findAll();
    }
    public void addBurger(Burger burger) {

        burgerRepository.save(burger);
    }
}
