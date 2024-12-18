package com.example.demo.service;

import com.example.demo.model.Burger;
import com.example.demo.repository.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Burger getBurgerById(Long id) {
        Optional<Burger> Optburger = burgerRepository.findById(id);
        if(Optburger.isPresent()) {
            return Optburger.get();
        }
        else {
            return null;
        }

    }
    public void editBurger(Burger burger) {
        burgerRepository.save(burger);
    }
    public void deleteBurger(Long id) {
        burgerRepository.deleteById(id);
    }
}
