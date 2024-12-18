package com.example.demo;

import com.example.demo.model.Burger;
import com.example.demo.service.BurgerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class BurgerController {
    @Autowired
    BurgerService burgerService;
    @GetMapping("")
    public String burger(Model model,@ModelAttribute("burger") Burger burger) {
        model.addAttribute("burgers" ,burgerService.getAllBurgers());
        return "index.jsp";
    }
    @PostMapping("/addBurger")
    public String addBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult bindingResult,Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("burgers" ,burgerService.getAllBurgers());
            return "index.jsp";
        }else {
            burgerService.addBurger(burger);
            return "redirect:/";
        }

    }
}
