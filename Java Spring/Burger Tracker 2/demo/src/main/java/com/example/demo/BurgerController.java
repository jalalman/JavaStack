package com.example.demo;

import com.example.demo.model.Burger;
import com.example.demo.service.BurgerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping(value = "/edit/{id}")
    public String showEditBurger( @ModelAttribute("burger") Burger burger, @PathVariable("id") long id, Model model) {

        model.addAttribute("burger",burgerService.getBurgerById(id));
        return "editburger.jsp";
    }

    @PostMapping("/editBurger")
    public String editBurger(@Valid @ModelAttribute("burger") Burger EditBurger, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "editburger.jsp";
        }else{
            burgerService.editBurger(EditBurger);
            return "redirect:/";
        }
    }
    @PostMapping("/delete")
    public String deleteBurger(@RequestParam(value="id") Long id) {
        burgerService.deleteBurger(id);
        return "redirect:/";
    }

}
